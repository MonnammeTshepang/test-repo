package cdc.dddg.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(Tkda05PK.class)
public class Tkda05 {
    private String proda;
    private String prima;
    private String hist;
    private String awahl;
    private String sala;
    private String saben;
    private String gkz;
    private String gehkz;

    @Id
    @Column(name = "proda", nullable = false, length = -1)
    public String getProda() {
        return proda;
    }

    public void setProda(String proda) {
        this.proda = proda;
    }

    @Id
    @Column(name = "prima", nullable = false, length = 3)
    public String getPrima() {
        return prima;
    }

    public void setPrima(String prima) {
        this.prima = prima;
    }

    @Id
    @Column(name = "hist", nullable = false, length = -1)
    public String getHist() {
        return hist;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }

    @Basic
    @Column(name = "awahl", nullable = false, length = -1)
    public String getAwahl() {
        return awahl;
    }

    public void setAwahl(String awahl) {
        this.awahl = awahl;
    }

    @Basic
    @Column(name = "sala", nullable = false, length = 5)
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Basic
    @Column(name = "saben", nullable = false, length = 40)
    public String getSaben() {
        return saben;
    }

    public void setSaben(String saben) {
        this.saben = saben;
    }

    @Basic
    @Column(name = "gkz", nullable = false, length = -1)
    public String getGkz() {
        return gkz;
    }

    public void setGkz(String gkz) {
        this.gkz = gkz;
    }

    @Basic
    @Column(name = "gehkz", nullable = false, length = -1)
    public String getGehkz() {
        return gehkz;
    }

    public void setGehkz(String gehkz) {
        this.gehkz = gehkz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tkda05 tkda05 = (Tkda05) o;
        return Objects.equals(proda, tkda05.proda) && Objects.equals(prima, tkda05.prima) && Objects.equals(hist, tkda05.hist) && Objects.equals(awahl, tkda05.awahl) && Objects.equals(sala, tkda05.sala) && Objects.equals(saben, tkda05.saben) && Objects.equals(gkz, tkda05.gkz) && Objects.equals(gehkz, tkda05.gehkz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proda, prima, hist, awahl, sala, saben, gkz, gehkz);
    }
}
