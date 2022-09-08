package cdc.dddg.transfermetadata;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transfer_timings")
public class TransferTimings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "kafka_timestamp")
    private Instant kafkaTimestamp;

    @Column(name = "db2_timestamp")
    private Instant db2Timestamp;

    @Column(name = "app_timestamp")
    private Instant appTimestamp;

    @Column(name = "db2_app_latency")
    private Long db2AppLatency;

    @Column(name = "kafka_app_latency")
    private Long kafkaAppLatency;

    @Column(name = "entity_name")
    private String entityName;


    @Column(name = "    remote_app_latency")
    private Long remoteAppLatency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Instant getKafkaTimestamp() {
        return kafkaTimestamp;
    }

    public void setKafkaTimestamp(Instant kafkaTimestamp) {
        this.kafkaTimestamp = kafkaTimestamp;
    }

    public Instant getDb2Timestamp() {
        return db2Timestamp;
    }

    public void setDb2Timestamp(Instant db2Timestamp) {
        this.db2Timestamp = db2Timestamp;
    }

    public Instant getAppTimestamp() {
        return appTimestamp;
    }

    public void setAppTimestamp(Instant appTimestamp) {
        this.appTimestamp = appTimestamp;
    }

    public Long getDb2AppLatency() {
        return db2AppLatency;
    }

    public void setDb2AppLatency(Long db2AppLatency) {
        this.db2AppLatency = db2AppLatency;
    }

    public Long getKafkaAppLatency() {
        return kafkaAppLatency;
    }

    public void setKafkaAppLatency(Long kafkaAppLatency) {
        this.kafkaAppLatency = kafkaAppLatency;
    }

    public Long getRemoteAppLatency() {
        return remoteAppLatency;
    }

    public void setRemoteAppLatency(Long remoteAppLatency) {
        this.remoteAppLatency = remoteAppLatency;
    }
}
