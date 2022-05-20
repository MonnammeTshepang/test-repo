package cdc.dddg;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

@Entity
public class Kmnr implements Serializable {

    @Column(
            length = 6
    )
    @Id
    private String kmnr;
    @Column(
            length = 6
    )
    private String txtes;
    @Column(
            length = 18
    )
    private String kmpak;
    @Column(
            length = 40
    )
    private String kotxt;
    @Column(
            length = 4
    )
    private String kogr;
    @Column(
            length = 10
    )
    private String stand;
    @Column(
            length = 8
    )
    private String kmabtlung;
    private LocalDate dtanl;
    private LocalDate dtaen;
    @Column(
            length = 8
    )
    private String art;
    @JsonProperty("ziel_termin")
    @Column(
            name = "ZIEL_TERMIN"
    )
    private LocalDate zielTermin;
    @JsonProperty("se_termin")
    @Column(
            name = "SE_TERMIN",
            length = 8
    )
    private String seTermin;
    @JsonProperty("ze_termin")
    @Column(
            name = "ZE_TERMIN",
            length = 8
    )
    private String zeTermin;

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

    public Kmnr() {
    }

    public String getKmnr() {
        return this.kmnr;
    }

    public void setKmnr(String kmnr) {
        this.kmnr = kmnr;
    }

    public String getTxtes() {
        return this.txtes;
    }

    public void setTxtes(String txtes) {
        this.txtes = txtes;
    }

    public String getKmpak() {
        return this.kmpak;
    }

    public void setKmpak(String kmpak) {
        this.kmpak = kmpak;
    }

    public String getKotxt() {
        return this.kotxt;
    }

    public void setKotxt(String kotxt) {
        this.kotxt = kotxt;
    }

    public String getKogr() {
        return this.kogr;
    }

    public void setKogr(String kogr) {
        this.kogr = kogr;
    }

    public String getStand() {
        return this.stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public String getKmabtlung() {
        return this.kmabtlung;
    }

    public void setKmabtlung(String kmabtlung) {
        this.kmabtlung = kmabtlung;
    }

    public LocalDate getDtanl() {
        return this.dtanl;
    }

    public void setDtanl(LocalDate dtanl) {
        this.dtanl = dtanl;
    }

    public LocalDate getDtaen() {
        return this.dtaen;
    }

    public void setDtaen(LocalDate dtaen) {
        this.dtaen = dtaen;
    }

    public String getArt() {
        return this.art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public LocalDate getZielTermin() {
        return this.zielTermin;
    }

    public void setZielTermin(LocalDate zielTermin) {
        this.zielTermin = zielTermin;
    }

    public String getSeTermin() {
        return this.seTermin;
    }

    public void setSeTermin(String seTermin) {
        this.seTermin = seTermin;
    }

    public String getZeTermin() {
        return this.zeTermin;
    }

    public void setZeTermin(String zeTermin) {
        this.zeTermin = zeTermin;
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
}

