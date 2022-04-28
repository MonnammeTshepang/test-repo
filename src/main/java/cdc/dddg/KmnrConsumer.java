package cdc.dddg;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped public class KmnrConsumer {
    String message;

    @Incoming("kmnr")
        public void consume(ConsumerRecord<String, String> record) {
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long timestamp = record.timestamp();

        this.message = record.toString();

        System.out.println("timestamp: " + timestamp + ", topic: " + topic + ", value: " + value + "\n");
    }
}
