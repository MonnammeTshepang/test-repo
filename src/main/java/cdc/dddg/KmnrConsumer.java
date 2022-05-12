package cdc.dddg;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

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
        Instant lastRecordUTC = Instant.now();

        // Kafka UTC timestamp
        Instant kafkaUTC = Instant.ofEpochMilli(kafkaUnix);

        // Latency calculation
        Duration latency = Duration.between(kafkaUTC, lastRecordUTC);

        System.out.println("timestamp: " + kafkaUTC + "; topic: " + record.topic() + "; latency: " + latency.toMillis() + "; value: " + record.value().toString());

        GenericRecord entry = (GenericRecord) record.value().get("after_image");
        if (record.value().get("before_image") == null) {
            //new record
            repository.saveAll(List.of(KmnrMapper.map(entry)));
        }

    }

}
