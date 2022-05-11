package cdc.dddg;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.Duration;
import java.time.Instant;

@ApplicationScoped
@Path("/streaming-data")
public class KmnrConsumer {
    String message;
    long kafkaUnix;
    Instant kafkaUTC;
    Instant lastRecordUTC;

    /**
     * Constructor to initially produce message
     */
    public KmnrConsumer() {
        this.message = "timestamp: 123, topic: test, value: {\"id\":0,\"message\":\"test0\"}";
        this.kafkaUnix = 1651570331795L;
        this.kafkaUTC = Instant.ofEpochMilli(this.kafkaUnix);
    }

    @Incoming("kmnr")
    public void consume(ConsumerRecord<String, GenericRecord> record) {
        String topic = record.topic();
        String key = record.key();
        String value = (record.value().toString());
        this.kafkaUnix = record.timestamp();

        // Current UTC timestamp
        this.lastRecordUTC = Instant.now();

        // Kafka UTC timestamp
        this.kafkaUTC = Instant.ofEpochMilli(this.kafkaUnix);

        // Latency calculation
        Duration latency = Duration.between(this.kafkaUTC, this.lastRecordUTC);
        this.message = record.toString();

        System.out.println("timestamp: " + this.kafkaUTC + "; topic: " + topic + "; latency: " + latency.toMillis() + " value: " + value);
    }

    @GET
    public String response() {
        return this.message;
    }
}
