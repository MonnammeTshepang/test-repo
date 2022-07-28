package cdc.dddg;

import cdc.dddg.transfermetadata.TransferTimings;
import cdc.dddg.transfermetadata.TransferTimingsRepository;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.function.Function;

import static javax.transaction.Transactional.TxType.NOT_SUPPORTED;

@ApplicationScoped
public class KmnrConsumer {

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
        //   System.out.println("topic: " + record.topic() + " schema: " + record.value().getSchema().toString() + "\n");
        Instant appUTC = Instant.now();
        persistDataChange(record);
        saveTimings(record, appUTC);
//        System.out.println("topic: " + record.topic() + "; DB2Timestamp: " + db2UTC + "; KafkaTimestamp: " + kafkaUTC + "; AppTimestamp: " + appUTC + "; latency:DB-App " + db2Latency.toMillis() + "; latency:Kafka-App " + kafkaLatency.toMillis() + "; value: " + record.value().toString());
    }

    private void persistDataChange(ConsumerRecord<String, GenericRecord> record) {
        String topic = record.topic();

        Function<GenericRecord, Object> mapper = modelMappingService.getMapper(topic);
        if (mapper != null) {
            if (!Objects.equals(record.value().get("change_op").toString(), "I")
                    && ! Objects.equals(record.value().get("change_op").toString(), "U")) {
                System.out.println("not a I/U operation");
                return;
            }
            GenericRecord entry = (GenericRecord) record.value().get("after_image");

            Object entity = mapper.apply(entry);
            JpaRepository repository = modelMappingService.getRepository(topic);
            repository.save(entity);
        } else {
            System.out.println("topic with no config yet " + topic);
        }
    }

    private void saveTimings(ConsumerRecord<String, GenericRecord> record, Instant appUTC) {
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
            Instant db2UTC = Instant.parse(db2Timestamp.toString());
            Duration db2Latency = Duration.between(db2UTC, appUTC);
            timings.setDb2Timestamp(db2UTC);
            timings.setDb2AppLatency(db2Latency.toMillis());
        }

        String topic = record.topic();
        String ent = topic.substring(topic.lastIndexOf(".") + 1);
        timings.setEntityName(ent);
        timings.setRemoteAppLatency(Duration.between(appUTC, Instant.now()).toMillis());
        timingsRepository.save(timings);
    }
}


