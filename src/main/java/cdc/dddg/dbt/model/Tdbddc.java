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
@Table(schema = "dbt", name = "tdbddc")
public class Tdbddc {

    private BigInteger pnum;
    private LocalDateTime timestamp;
    private String plexmem;


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tdbddc)) return false;
        Tdbddc tdbddc = (Tdbddc) o;
        return Objects.equals(pnum, tdbddc.pnum) && Objects.equals(timestamp,
                                                                   tdbddc.timestamp) && Objects.equals(
                plexmem, tdbddc.plexmem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnum, timestamp, plexmem);
    }
}
