package cdc.dddg;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import java.time.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Named("app")
@Path("/streaming-data")
public class KmnrConsumer implements RequestHandler<Object, String> {
    String message;
    long kafkaUnix;
    Instant kafkaUTC;
    Instant lastRecordUTC;

    @Override
    public String handleRequest(Object event, Context context) {
        LambdaLogger logger = context.getLogger();
        String response = new String("SUCCESS");
        logger.log("Remote App Lite online");
        return response;
    }

    /**
     * Constructor to initially produce message
     */
    public KmnrConsumer() {
        this.message = "timestamp: 123, topic: test, value: {\"id\":0,\"message\":\"test0\"}";
        this.kafkaUnix = 1651570331795L;
        this.kafkaUTC = Instant.ofEpochMilli(this.kafkaUnix);
    }

    @Incoming("kmnr")
        public void consume(ConsumerRecord<String, String> record) {
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        this.kafkaUnix = record.timestamp();

        // Current UTC timestamp
        this.lastRecordUTC = Instant.now();

        // Kafka UTC timestamp
        this.kafkaUTC = Instant.ofEpochMilli(this.kafkaUnix);

        // Latency calculation
        Duration latency = Duration.between(this.lastRecordUTC, this.kafkaUTC);
        System.out.println(latency.toMillis());
        this.message = record.toString();

        System.out.println("timestamp: " + this.kafkaUTC + ", topic: " + topic + ", value: " + value);
    }

    // Get mit parameter nach dem gesucht werden kann z.b. ID
    // Timestamp gesucht
    @GET
    public String response() {
        System.out.println(
                "Kafka Record Timestamps: \n"
                + "Received: " + this.lastRecordUTC + "\n"
                + "Metadata: " + this.kafkaUTC);

        return this.message;
    }
}
