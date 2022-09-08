package cdc.dddg.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "kdt", name = "tkda05")
public class Tkda05 {

    private Tkda05PK tkda05PK;
    private String awahl;
    private String sala;
    private String saben;
    private String gkz;
    private String gehkz;

    @EmbeddedId
    public Tkda05PK getTkda05PK() {
        return tkda05PK;
    }

    public void setTkda05PK(Tkda05PK tkda05PK) {
        this.tkda05PK = tkda05PK;
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
        if (!(o instanceof Tkda05)) return false;
        Tkda05 tkda05 = (Tkda05) o;
        return Objects.equals(tkda05PK, tkda05.tkda05PK) && Objects.equals(awahl, tkda05.awahl) && Objects.equals(sala, tkda05.sala) && Objects.equals(saben, tkda05.saben) && Objects.equals(gkz, tkda05.gkz) && Objects.equals(gehkz, tkda05.gehkz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tkda05PK, awahl, sala, saben, gkz, gehkz);
    }
}
