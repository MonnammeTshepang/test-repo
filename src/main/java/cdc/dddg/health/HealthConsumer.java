package cdc.dddg.health;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.Instant;

import static javax.transaction.Transactional.TxType.NOT_SUPPORTED;


@ApplicationScoped
public class HealthConsumer {

    private final HealthDataRepository repository;
    private static final Logger LOG = Logger.getLogger(HealthConsumer.class);

    @Inject
    public HealthConsumer(HealthDataRepository repository) {
        this.repository = repository;
    }

    @Incoming("health")
    @Transactional(NOT_SUPPORTED)
    public void consume(ConsumerRecord<String, String> record) {
        long kafkaUnix = record.timestamp();

        // Current UTC timestamp
        Instant appUTC = Instant.now();

        // Kafka UTC timestamp
        Instant kafkaUTC = Instant.ofEpochMilli(kafkaUnix);

        LOG.debug("Health, topic: \" + record.topic() + \"; KafkaTimestamp: \" + kafkaUTC + \"; AppTimestamp: \" + appUTC " +
                         "\";  latency:Kafka-App \" + kafkaLatency.toMillis() + \"; value: \" + record.value()");
        repository.save(new HealthData(kafkaUTC, appUTC, record.value()));
    }
}
