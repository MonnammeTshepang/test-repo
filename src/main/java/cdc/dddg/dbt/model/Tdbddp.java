package cdc.dddg.dbt.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(schema = "dbt", name = "tdbddp")
public class Tdbddp {
    private BigInteger pnum;
    private LocalDateTime timestamp;
    private String plexmem;
    private BigInteger updatecolp = BigInteger.ZERO;

    @Id
    @Column(name = "pnum", nullable = false)
    public BigInteger getPnum() {
        return pnum;
    }

    public void setPnum(BigInteger pnum) {
        this.pnum = pnum;
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
    @Column(name = "updatecolp", nullable = false)
    public BigInteger getUpdatecolp() {
        return updatecolp;
    }

    public void setUpdatecolp(BigInteger updatecolp) {
        this.updatecolp = updatecolp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tdbddp)) return false;
        Tdbddp tdbddp = (Tdbddp) o;
        return Objects.equals(pnum, tdbddp.pnum)
                && Objects.equals(timestamp, tdbddp.timestamp) && Objects.equals(plexmem,
                                                                                 tdbddp.plexmem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnum, timestamp, plexmem);
    }
}


