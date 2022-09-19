package cdc.dddg.dbt.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(schema = "dbt", name = "tdbddc")
public class Tdbddc {

    private TdbddcPK tdbddcPK;
    private LocalDateTime timestamp;
    private String plexmem;
    private BigInteger updatecolc = BigInteger.ZERO;

    @EmbeddedId
    public TdbddcPK getTdbddcPK() {
        return tdbddcPK;
    }

    public void setTdbddcPK(TdbddcPK tdbddcPK) {
        this.tdbddcPK = tdbddcPK;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "plexmem", nullable = true)
    public String getPlexmem() {
        return plexmem;
    }

    public void setPlexmem(String plexmem) {
        this.plexmem = plexmem;
    }

    @Basic
    @Column(name = "updatecolc", nullable = true)
    public BigInteger getUpdatecolc() {
        return updatecolc;
    }

    public void setUpdatecolc(BigInteger updatecolc) {
        this.updatecolc = updatecolc;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Tdbddc)) return false;
        Tdbddc tdbddc = (Tdbddc) o;
        return Objects.equals(tdbddcPK, tdbddc.tdbddcPK) && Objects.equals(timestamp,
                                                                           tdbddc.timestamp) && Objects.equals(
                plexmem, tdbddc.plexmem) && Objects.equals(updatecolc, tdbddc.updatecolc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tdbddcPK, timestamp, plexmem, updatecolc);
    }
}
