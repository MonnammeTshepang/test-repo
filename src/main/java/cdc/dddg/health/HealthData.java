package cdc.dddg.health;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "health_data")
public class HealthData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "create_timestamp")
    private Instant createTimestamp;

    @Column(name = "receive_timestamp")
    private Instant receiveTimestamp;

    @Column(name = "hdata")
    String data;

    public HealthData() {
    }

    public HealthData(Instant createTimestamp, Instant receiveTimestamp, String data) {
        this.createTimestamp = createTimestamp;
        this.receiveTimestamp = receiveTimestamp;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Instant createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Instant getReceiveTimestamp() {
        return receiveTimestamp;
    }

    public void setReceiveTimestamp(Instant receiveTimestamp) {
        this.receiveTimestamp = receiveTimestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

