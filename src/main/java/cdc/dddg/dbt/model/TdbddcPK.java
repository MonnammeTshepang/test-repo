package cdc.dddg.dbt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;


@Embeddable
public class TdbddcPK implements Serializable {

    private BigInteger pnum;
    private BigInteger cnum;

    @Column(name = "pnum", nullable = false, length = -1)
    public BigInteger getPnum() {
        return pnum;
    }

    public void setPnum(BigInteger pnum) {
        this.pnum = pnum;
    }

    @Column(name = "cnum", nullable = false, length = -1)
    public BigInteger getCnum() {
        return cnum;
    }

    public void setCnum(BigInteger cnum) {
        this.cnum = cnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TdbddcPK)) return false;
        TdbddcPK tdbddcPK = (TdbddcPK) o;
        return Objects.equals(pnum, tdbddcPK.pnum) && Objects.equals(cnum, tdbddcPK.cnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnum, cnum);
    }


}
