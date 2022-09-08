package cdc.dddg.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "kdt", name = "tkda10")
public class Tkda10 {
    private String lack;
    private String lart;
    private String facod;
    private String anzkz;
    private String gkzh;
    private String lben;
    private String lackverwendung;
    private String kreis;
    private String lackartAlt;

    @Id
    @Column(name = "lack", nullable = false, length = 3)
    public String getLack() {
        return lack;
    }

    public void setLack(String lack) {
        this.lack = lack;
    }

    @Basic
    @Column(name = "lart", nullable = false, length = -1)
    public String getLart() {
        return lart;
    }

    public void setLart(String lart) {
        this.lart = lart;
    }

    @Basic
    @Column(name = "facod", nullable = false, length = 2)
    public String getFacod() {
        return facod;
    }

    public void setFacod(String facod) {
        this.facod = facod;
    }

    @Basic
    @Column(name = "anzkz", nullable = false, length = -1)
    public String getAnzkz() {
        return anzkz;
    }

    public void setAnzkz(String anzkz) {
        this.anzkz = anzkz;
    }

    @Basic
    @Column(name = "gkzh", nullable = false, length = -1)
    public String getGkzh() {
        return gkzh;
    }

    public void setGkzh(String gkzh) {
        this.gkzh = gkzh;
    }

    @Basic
    @Column(name = "lben", nullable = false, length = 40)
    public String getLben() {
        return lben;
    }

    public void setLben(String lben) {
        this.lben = lben;
    }

    @Basic
    @Column(name = "lackverwendung", nullable = false, length = -1)
    public String getLackverwendung() {
        return lackverwendung;
    }

    public void setLackverwendung(String lackverwendung) {
        this.lackverwendung = lackverwendung;
    }

    @Basic
    @Column(name = "kreis", nullable = true, length = -1)
    public String getKreis() {
        return kreis;
    }

    public void setKreis(String kreis) {
        this.kreis = kreis;
    }

    @Basic
    @Column(name = "lackart_alt", nullable = false, length = -1)
    public String getLackartAlt() {
        return lackartAlt;
    }

    public void setLackartAlt(String lackartAlt) {
        this.lackartAlt = lackartAlt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tkda10 tkda10 = (Tkda10) o;
        return Objects.equals(lack, tkda10.lack) && Objects.equals(lart, tkda10.lart) && Objects.equals(facod, tkda10.facod) && Objects.equals(anzkz, tkda10.anzkz) && Objects.equals(gkzh, tkda10.gkzh) && Objects.equals(lben, tkda10.lben) && Objects.equals(lackverwendung, tkda10.lackverwendung) && Objects.equals(kreis, tkda10.kreis) && Objects.equals(lackartAlt, tkda10.lackartAlt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lack, lart, facod, anzkz, gkzh, lben, lackverwendung, kreis, lackartAlt);
    }
}
