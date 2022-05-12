package cdc.dddg;

import java.time.LocalDate;
import java.util.Objects;

public final class KmnrDto {
    private final String kmnr;
    private final String kmabtlung;
    private final LocalDate dtanl;
    private final String kotxt;
    private final String kogr;
    private final String stand;
    private final String txtes;
    private final String zielTermin;

    KmnrDto(String kmnr, String kmabtlung, LocalDate dtanl, String kotxt, String kogr, String stand, String txtes, String zielTermin) {
        this.kmnr = kmnr;
        this.kmabtlung = kmabtlung;
        this.dtanl = dtanl;
        this.kotxt = kotxt;
        this.kogr = kogr;
        this.stand = stand;
        this.txtes = txtes;
        this.zielTermin = zielTermin;
    }

    public String kmnr() {
        return this.kmnr;
    }

    public String kmabtlung() {
        return this.kmabtlung;
    }

    public LocalDate dtanl() {
        return this.dtanl;
    }

    public String kotxt() {
        return this.kotxt;
    }

    public String kogr() {
        return this.kogr;
    }

    public String stand() {
        return this.stand;
    }

    public String txtes() {
        return this.txtes;
    }

    public String zielTermin() {
        return this.zielTermin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            KmnrDto that = (KmnrDto) obj;
            return Objects.equals(this.kmnr, that.kmnr) && Objects.equals(this.kmabtlung, that.kmabtlung) && Objects.equals(this.dtanl, that.dtanl) && Objects.equals(this.kotxt, that.kotxt) && Objects.equals(this.kogr, that.kogr) && Objects.equals(this.stand, that.stand) && Objects.equals(this.txtes, that.txtes) && Objects.equals(this.zielTermin, that.zielTermin);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.kmnr, this.kmabtlung, this.dtanl, this.kotxt, this.kogr, this.stand, this.txtes, this.zielTermin});
    }

    public String toString() {
        return "KmnrDto[kmnr=" + this.kmnr + ", kmabtlung=" + this.kmabtlung + ", dtanl=" + this.dtanl + ", kotxt=" + this.kotxt + ", kogr=" + this.kogr + ", stand=" + this.stand + ", txtes=" + this.txtes + ", zielTermin=" + this.zielTermin + "]";
    }
}
