package cdc.dddg;

import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped public class KmnrConsumer {
    final KmnrRepository repository;

    public KmnrConsumer(KmnrRepository repository) {
        this.repository = repository;
    }
    @Incoming("kmnr") public void cosume(GenericRecord record) {
        repository.save(map(record));
    }
}
