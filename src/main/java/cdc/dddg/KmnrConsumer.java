package cdc.dddg;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

import static javax.transaction.Transactional.TxType.NOT_SUPPORTED;

@ApplicationScoped
public class KmnrConsumer {

    final KmnrRepository repository;

    /**
     * Constructor to initially produce message
     */
    @Inject
    public KmnrConsumer(KmnrRepository repository) {
        this.repository = repository;
    }

    @Incoming("kmnr")
    @Transactional(NOT_SUPPORTED)
    public void consume(ConsumerRecord<String, GenericRecord> record) {
        long kafkaUnix = record.timestamp();

        // Current UTC timestamp
        Instant appUTC = Instant.now();

        // Kafka UTC timestamp
        Instant kafkaUTC = Instant.ofEpochMilli(kafkaUnix);

        // Latency calculation
        Duration kafkaLatency = Duration.between(kafkaUTC, appUTC);
        String db2Timestamp = record.value().get("timestamp").toString();
        Instant db2UTC = Instant.parse(db2Timestamp);
        Duration db2Latency = Duration.between(db2UTC, appUTC);
        System.out.println("topic: " + record.topic() + "; DB2Timestamp: " + db2UTC + "; KafkaTimestamp: " + kafkaUTC + "; AppTimestamp: " + appUTC + "; latency:DB-App " + db2Latency.toMillis() + "; latency:Kafka-App " + kafkaLatency.toMillis() + "; value: " + record.value().toString());

        processRecord(record.value(), db2UTC, kafkaUTC, appUTC, db2Latency, kafkaLatency);

    }

    private void processRecord(GenericRecord record, Instant db2UTC, Instant kafkaUTC, Instant appUTC, Duration db2Latency, Duration kafkaLatency) {

        if (Objects.equals(record.get("change_op").toString(), "I")) {
            //new record
            GenericRecord entry = (GenericRecord) record.get("after_image");
            repository.save(KmnrMapper.map(entry, db2UTC, kafkaUTC, appUTC, db2Latency, kafkaLatency));
        } else if (Objects.equals(record.get("change_op").toString(), "U")) {
            //update record
            GenericRecord entry = (GenericRecord) record.get("after_image");
            repository.save(KmnrMapper.map(entry, db2UTC, kafkaUTC, appUTC, db2Latency, kafkaLatency));
        } else if (Objects.equals(record.get("change_op").toString(), "D")) {
            //delete record
            //intentional commented to store the kmnr information in database for longer time.
            //GenericRecord deletedEntry = (GenericRecord) record.get("before_image");
            //repository.deleteById(deletedEntry.get("kmnr").toString());
        } else {
            System.out.println("UNKNOWN");
        }

    }
}


