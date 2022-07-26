package cdc.dddg.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Tkda05PK implements Serializable {
    private String proda;
    private String prima;
    private String hist;

    @Column(name = "proda", nullable = false, length = -1)
    @Id
    public String getProda() {
        return proda;
    }

    public void setProda(String proda) {
        this.proda = proda;
    }

    @Column(name = "prima", nullable = false, length = 3)
    @Id
    public String getPrima() {
        return prima;
    }

    public void setPrima(String prima) {
        this.prima = prima;
    }

    @Column(name = "hist", nullable = false, length = -1)
    @Id
    public String getHist() {
        return hist;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tkda05PK tkda05PK = (Tkda05PK) o;
        return Objects.equals(proda, tkda05PK.proda) && Objects.equals(prima, tkda05PK.prima) && Objects.equals(hist, tkda05PK.hist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proda, prima, hist);
    }
}
