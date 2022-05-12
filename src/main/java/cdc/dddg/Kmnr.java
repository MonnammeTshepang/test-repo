package cdc.dddg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kmnr implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(
            length = 6
    )
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

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

