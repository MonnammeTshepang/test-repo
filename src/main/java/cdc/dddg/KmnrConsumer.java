package cdc.dddg;

import cdc.dddg.transfermetadata.TransferTimings;
import cdc.dddg.transfermetadata.TransferTimingsRepository;
import org.apache.avro.generic.GenericRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import static javax.transaction.Transactional.TxType.NOT_SUPPORTED;

@ApplicationScoped
public class KmnrConsumer {

    private static final List<String> LASTTEST_TOPICS = List.of("bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddc",
                                                                "bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddp");

    private static final Logger LOG = Logger.getLogger(KmnrConsumer.class);

    private static final DateTimeFormatter TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss.SSSSSS");

    private final ModelMappingService modelMappingService;

    private final TransferTimingsRepository timingsRepository;

    @Inject
    public KmnrConsumer(ModelMappingService modelMappingService, TransferTimingsRepository timingsRepository) {
        this.modelMappingService = modelMappingService;
        this.timingsRepository = timingsRepository;
    }


    @Incoming("kmnr")
    @Transactional(NOT_SUPPORTED)
    public void consume(ConsumerRecord<String, GenericRecord> record) {
        Instant appUTC = Instant.now();
        persistDataChange(record);
        saveTimings(record, appUTC);
    }

    private void persistDataChange(ConsumerRecord<String, GenericRecord> record) {
        String topic = record.topic();
        String recordsSchema = record.value().getSchema().toString(true);
        LOG.debug("caputred message schema: " + recordsSchema);

        Function<GenericRecord, Object> mapper = modelMappingService.getMapper(topic);
        if (mapper != null) {
            if (Objects.equals(record.value().get("change_op").toString(), "D")
                    || !record.value().hasField("after_image")) {
                LOG.debug("not a I/U operation");
                return;
            }
            GenericRecord entry = (GenericRecord) record.value().get("after_image");

            Object entity = mapper.apply(entry);
            JpaRepository repository = modelMappingService.getRepository(topic);
            repository.save(entity);
        } else {
            LOG.info("topic with no config yet " + topic);
            LOG.info(recordsSchema);
        }
    }

    private void saveTimings(ConsumerRecord<String, GenericRecord> record, Instant appUTC) {
        String topic = record.topic();

        TransferTimings timings = new TransferTimings();
        timings.setAppTimestamp(appUTC);

        // kafka latency
        long kafkaUnix = record.timestamp();
        Instant kafkaUTC = Instant.ofEpochMilli(kafkaUnix);
        Duration kafkaLatency = Duration.between(kafkaUTC, appUTC);
        timings.setKafkaTimestamp(kafkaUTC);
        timings.setKafkaAppLatency(kafkaLatency.toMillis());

        // db2 latency
        Object db2Timestamp = record.value().get("timestamp");
        if (db2Timestamp != null) {
            Instant db2UTC = parseTimestamp(db2Timestamp.toString());
            Duration db2Latency = Duration.between(db2UTC, appUTC);
            timings.setDb2Timestamp(db2UTC);
            timings.setDb2AppLatency(db2Latency.toMillis());
        }

        String ent = topic.substring(topic.lastIndexOf(".") + 1);
        timings.setEntityName(ent);
        timings.setRemoteAppLatency(Duration.between(appUTC, Instant.now()).toMillis());
        timingsRepository.save(timings);
    }

    private static Instant parseTimestamp(String timestamp) {
        if (timestamp.length() < 26 || timestamp.contains("Z") || timestamp.contains("T")) {
            String unifiedTimestamp =
                    StringUtils.replaceEach(timestamp, new String[]{"T", "Z", ":"}, new String[]{" ", "", "."});
            if (unifiedTimestamp.length() == 19) {
                unifiedTimestamp = unifiedTimestamp + ".";
            }
            unifiedTimestamp = StringUtils.rightPad(unifiedTimestamp, 26, "0");
            return LocalDateTime.parse(unifiedTimestamp, TIMESTAMP_FORMATTER).toInstant(ZoneOffset.ofHours(0));
        }
        return LocalDateTime.parse(timestamp, TIMESTAMP_FORMATTER).toInstant(ZoneOffset.ofHours(0));
    }
}
