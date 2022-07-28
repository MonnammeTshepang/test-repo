package cdc.dddg.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(schema = "kdt", name = "tkdn01")
public class Tkdn01 {
    private String kmnr;
    private BigInteger agbst;
    private String txtes;
    private String kzets;
    private String kmpak;
    private String kotxt;
    private String kogr;
    private LocalDate laend;
    private String sz;
    private String stand;
    private String erstl;
    private String kmabtlung;
    private LocalDate dtanl;
    private LocalDate dtaen;
    private String kzaus;
    private String art;
    private String jahr;
    private String lfd;
    private BigInteger solltt;
    private BigInteger sollmm;
    private Integer solljj;
    private String umdrehKz;
    private String reakt;
    private String neuanUid;
    private String dateskz;
    private LocalDate stadt;
    private LocalDate zielTermin;
    private String archivKz;
    private String herku;
    private String uidaen;
    private String sysanl;
    private String sysaen;
    private String kostRelKz;
    private String migKz;
    private String pepPhase;
    private String qRisiko;
    private String prfkz;
    private LocalDateTime prfdat;
    private String seTermin;
    private String zeTermin;
    private String admin;
    private String telefonnrAnleger;
    private String telefonnrBearbeiter;
    private String pkrKz;
    private LocalDate aeabschluss;
    private String softwareKz;
    private String onlineSynchroStatus;
    private String onlineSynchroFreigabe;



    @Id
    @Column(name = "kmnr", nullable = false, length = 6)
    public String getKmnr() {
        return kmnr;
    }

    public void setKmnr(String kmnr) {
        this.kmnr = kmnr;
    }

    @Basic
    @Column(name = "agbst", nullable = false, precision = 0)
    public BigInteger getAgbst() {
        return agbst;
    }

    public void setAgbst(BigInteger agbst) {
        this.agbst = agbst;
    }

    @Basic
    @Column(name = "txtes", nullable = false, length = 6)
    public String getTxtes() {
        return txtes;
    }

    public void setTxtes(String txtes) {
        this.txtes = txtes;
    }

    @Basic
    @Column(name = "kzets", nullable = false, length = -1)
    public String getKzets() {
        return kzets;
    }

    public void setKzets(String kzets) {
        this.kzets = kzets;
    }

    @Basic
    @Column(name = "kmpak", nullable = false, length = 18)
    public String getKmpak() {
        return kmpak;
    }

    public void setKmpak(String kmpak) {
        this.kmpak = kmpak;
    }

    @Basic
    @Column(name = "kotxt", nullable = false, length = 40)
    public String getKotxt() {
        return kotxt;
    }

    public void setKotxt(String kotxt) {
        this.kotxt = kotxt;
    }

    @Basic
    @Column(name = "kogr", nullable = false, length = 4)
    public String getKogr() {
        return kogr;
    }

    public void setKogr(String kogr) {
        this.kogr = kogr;
    }

    @Basic
    @Column(name = "laend", nullable = true)
    public LocalDate getLaend() {
        return laend;
    }

    public void setLaend(LocalDate laend) {
        this.laend = laend;
    }

    @Basic
    @Column(name = "sz", nullable = false, length = -1)
    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    @Basic
    @Column(name = "stand", nullable = false, length = 10)
    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    @Basic
    @Column(name = "erstl", nullable = false, length = 8)
    public String getErstl() {
        return erstl;
    }

    public void setErstl(String erstl) {
        this.erstl = erstl;
    }

    @Basic
    @Column(name = "kmabtlung", nullable = false, length = 8)
    public String getKmabtlung() {
        return kmabtlung;
    }

    public void setKmabtlung(String kmabtlung) {
        this.kmabtlung = kmabtlung;
    }

    @Basic
    @Column(name = "dtanl", nullable = true)
    public LocalDate getDtanl() {
        return dtanl;
    }

    public void setDtanl(LocalDate dtanl) {
        this.dtanl = dtanl;
    }

    @Basic
    @Column(name = "dtaen", nullable = true)
    public LocalDate getDtaen() {
        return dtaen;
    }

    public void setDtaen(LocalDate dtaen) {
        this.dtaen = dtaen;
    }

    @Basic
    @Column(name = "kzaus", nullable = false, length = -1)
    public String getKzaus() {
        return kzaus;
    }

    public void setKzaus(String kzaus) {
        this.kzaus = kzaus;
    }

    @Basic
    @Column(name = "art", nullable = false, length = -1)
    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Basic
    @Column(name = "jahr", nullable = false, length = -1)
    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    @Basic
    @Column(name = "lfd", nullable = false, length = 4)
    public String getLfd() {
        return lfd;
    }

    public void setLfd(String lfd) {
        this.lfd = lfd;
    }

    @Basic
    @Column(name = "solltt", nullable = true, precision = 0)
    public BigInteger getSolltt() {
        return solltt;
    }

    public void setSolltt(BigInteger solltt) {
        this.solltt = solltt;
    }

    @Basic
    @Column(name = "sollmm", nullable = true, precision = 0)
    public BigInteger getSollmm() {
        return sollmm;
    }

    public void setSollmm(BigInteger sollmm) {
        this.sollmm = sollmm;
    }

    @Basic
    @Column(name = "solljj", nullable = true, precision = 0)
    public Integer getSolljj() {
        return solljj;
    }

    public void setSolljj(Integer solljj) {
        this.solljj = solljj;
    }

    @Basic
    @Column(name = "umdreh_kz", nullable = false, length = -1)
    public String getUmdrehKz() {
        return umdrehKz;
    }

    public void setUmdrehKz(String umdrehKz) {
        this.umdrehKz = umdrehKz;
    }

    @Basic
    @Column(name = "reakt", nullable = true, length = -1)
    public String getReakt() {
        return reakt;
    }

    public void setReakt(String reakt) {
        this.reakt = reakt;
    }

    @Basic
    @Column(name = "neuan_uid", nullable = true, length = 8)
    public String getNeuanUid() {
        return neuanUid;
    }

    public void setNeuanUid(String neuanUid) {
        this.neuanUid = neuanUid;
    }

    @Basic
    @Column(name = "dateskz", nullable = true, length = -1)
    public String getDateskz() {
        return dateskz;
    }

    public void setDateskz(String dateskz) {
        this.dateskz = dateskz;
    }

    @Basic
    @Column(name = "stadt", nullable = true)
    public LocalDate getStadt() {
        return stadt;
    }

    public void setStadt(LocalDate stadt) {
        this.stadt = stadt;
    }

    @Basic
    @Column(name = "ziel_termin", nullable = true)
    public LocalDate getZielTermin() {
        return zielTermin;
    }

    public void setZielTermin(LocalDate zielTermin) {
        this.zielTermin = zielTermin;
    }

    @Basic
    @Column(name = "archiv_kz", nullable = false, length = -1)
    public String getArchivKz() {
        return archivKz;
    }

    public void setArchivKz(String archivKz) {
        this.archivKz = archivKz;
    }

    @Basic
    @Column(name = "herku", nullable = false, length = 2)
    public String getHerku() {
        return herku;
    }

    public void setHerku(String herku) {
        this.herku = herku;
    }

    @Basic
    @Column(name = "uidaen", nullable = false, length = 8)
    public String getUidaen() {
        return uidaen;
    }

    public void setUidaen(String uidaen) {
        this.uidaen = uidaen;
    }

    @Basic
    @Column(name = "sysanl", nullable = false, length = 2)
    public String getSysanl() {
        return sysanl;
    }

    public void setSysanl(String sysanl) {
        this.sysanl = sysanl;
    }

    @Basic
    @Column(name = "sysaen", nullable = false, length = 2)
    public String getSysaen() {
        return sysaen;
    }

    public void setSysaen(String sysaen) {
        this.sysaen = sysaen;
    }

    @Basic
    @Column(name = "kost_rel_kz", nullable = true, length = -1)
    public String getKostRelKz() {
        return kostRelKz;
    }

    public void setKostRelKz(String kostRelKz) {
        this.kostRelKz = kostRelKz;
    }

    @Basic
    @Column(name = "mig_kz", nullable = true, length = -1)
    public String getMigKz() {
        return migKz;
    }

    public void setMigKz(String migKz) {
        this.migKz = migKz;
    }

    @Basic
    @Column(name = "pep_phase", nullable = true, length = -1)
    public String getPepPhase() {
        return pepPhase;
    }

    public void setPepPhase(String pepPhase) {
        this.pepPhase = pepPhase;
    }

    @Basic
    @Column(name = "q_risiko", nullable = true, length = -1)
    public String getqRisiko() {
        return qRisiko;
    }

    public void setqRisiko(String qRisiko) {
        this.qRisiko = qRisiko;
    }

    @Basic
    @Column(name = "prfkz", nullable = false, length = -1)
    public String getPrfkz() {
        return prfkz;
    }

    public void setPrfkz(String prfkz) {
        this.prfkz = prfkz;
    }

    @Basic
    @Column(name = "prfdat", nullable = true)
    public LocalDateTime getPrfdat() {
        return prfdat;
    }

    public void setPrfdat(LocalDateTime prfdat) {
        this.prfdat = prfdat;
    }

    @Basic
    @Column(name = "se_termin", nullable = true, length = 4)
    public String getSeTermin() {
        return seTermin;
    }

    public void setSeTermin(String seTermin) {
        this.seTermin = seTermin;
    }

    @Basic
    @Column(name = "ze_termin", nullable = true, length = 4)
    public String getZeTermin() {
        return zeTermin;
    }

    public void setZeTermin(String zeTermin) {
        this.zeTermin = zeTermin;
    }

    @Basic
    @Column(name = "admin", nullable = false, length = -1)
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "telefonnr_anleger", nullable = true, length = 16)
    public String getTelefonnrAnleger() {
        return telefonnrAnleger;
    }

    public void setTelefonnrAnleger(String telefonnrAnleger) {
        this.telefonnrAnleger = telefonnrAnleger;
    }

    @Basic
    @Column(name = "telefonnr_bearbeiter", nullable = true, length = 16)
    public String getTelefonnrBearbeiter() {
        return telefonnrBearbeiter;
    }

    public void setTelefonnrBearbeiter(String telefonnrBearbeiter) {
        this.telefonnrBearbeiter = telefonnrBearbeiter;
    }

    @Basic
    @Column(name = "pkr_kz", nullable = true, length = -1)
    public String getPkrKz() {
        return pkrKz;
    }

    public void setPkrKz(String pkrKz) {
        this.pkrKz = pkrKz;
    }

    @Basic
    @Column(name = "aeabschluss", nullable = true)
    public LocalDate getAeabschluss() {
        return aeabschluss;
    }

    public void setAeabschluss(LocalDate aeabschluss) {
        this.aeabschluss = aeabschluss;
    }

    @Basic
    @Column(name = "software_kz", nullable = false, length = -1)
    public String getSoftwareKz() {
        return softwareKz;
    }

    public void setSoftwareKz(String softwareKz) {
        this.softwareKz = softwareKz;
    }

    @Basic
    @Column(name = "online_synchro_status", nullable = false, length = -1)
    public String getOnlineSynchroStatus() {
        return onlineSynchroStatus;
    }

    public void setOnlineSynchroStatus(String onlineSynchroStatus) {
        this.onlineSynchroStatus = onlineSynchroStatus;
    }

    @Basic
    @Column(name = "online_synchro_freigabe", nullable = false, length = -1)
    public String getOnlineSynchroFreigabe() {
        return onlineSynchroFreigabe;
    }

    public void setOnlineSynchroFreigabe(String onlineSynchroFreigabe) {
        this.onlineSynchroFreigabe = onlineSynchroFreigabe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tkdn01 tkdn01 = (Tkdn01) o;
        return Objects.equals(kmnr, tkdn01.kmnr) && Objects.equals(agbst, tkdn01.agbst) && Objects.equals(txtes, tkdn01.txtes) && Objects.equals(kzets, tkdn01.kzets) && Objects.equals(kmpak, tkdn01.kmpak) && Objects.equals(kotxt, tkdn01.kotxt) && Objects.equals(kogr, tkdn01.kogr) && Objects.equals(laend, tkdn01.laend) && Objects.equals(sz, tkdn01.sz) && Objects.equals(stand, tkdn01.stand) && Objects.equals(erstl, tkdn01.erstl) && Objects.equals(kmabtlung, tkdn01.kmabtlung) && Objects.equals(dtanl, tkdn01.dtanl) && Objects.equals(dtaen, tkdn01.dtaen) && Objects.equals(kzaus, tkdn01.kzaus) && Objects.equals(art, tkdn01.art) && Objects.equals(jahr, tkdn01.jahr) && Objects.equals(lfd, tkdn01.lfd) && Objects.equals(solltt, tkdn01.solltt) && Objects.equals(sollmm, tkdn01.sollmm) && Objects.equals(solljj, tkdn01.solljj) && Objects.equals(umdrehKz, tkdn01.umdrehKz) && Objects.equals(reakt, tkdn01.reakt) && Objects.equals(neuanUid, tkdn01.neuanUid) && Objects.equals(dateskz, tkdn01.dateskz) && Objects.equals(stadt, tkdn01.stadt) && Objects.equals(zielTermin, tkdn01.zielTermin) && Objects.equals(archivKz, tkdn01.archivKz) && Objects.equals(herku, tkdn01.herku) && Objects.equals(uidaen, tkdn01.uidaen) && Objects.equals(sysanl, tkdn01.sysanl) && Objects.equals(sysaen, tkdn01.sysaen) && Objects.equals(kostRelKz, tkdn01.kostRelKz) && Objects.equals(migKz, tkdn01.migKz) && Objects.equals(pepPhase, tkdn01.pepPhase) && Objects.equals(qRisiko, tkdn01.qRisiko) && Objects.equals(prfkz, tkdn01.prfkz) && Objects.equals(prfdat, tkdn01.prfdat) && Objects.equals(seTermin, tkdn01.seTermin) && Objects.equals(zeTermin, tkdn01.zeTermin) && Objects.equals(admin, tkdn01.admin) && Objects.equals(telefonnrAnleger, tkdn01.telefonnrAnleger) && Objects.equals(telefonnrBearbeiter, tkdn01.telefonnrBearbeiter) && Objects.equals(pkrKz, tkdn01.pkrKz) && Objects.equals(aeabschluss, tkdn01.aeabschluss) && Objects.equals(softwareKz, tkdn01.softwareKz) && Objects.equals(onlineSynchroStatus, tkdn01.onlineSynchroStatus) && Objects.equals(onlineSynchroFreigabe, tkdn01.onlineSynchroFreigabe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmnr, agbst, txtes, kzets, kmpak, kotxt, kogr, laend, sz, stand, erstl, kmabtlung, dtanl, dtaen, kzaus, art, jahr, lfd, solltt, sollmm, solljj, umdrehKz, reakt, neuanUid, dateskz, stadt, zielTermin, archivKz, herku, uidaen, sysanl, sysaen, kostRelKz, migKz, pepPhase, qRisiko, prfkz, prfdat, seTermin, zeTermin, admin, telefonnrAnleger, telefonnrBearbeiter, pkrKz, aeabschluss, softwareKz, onlineSynchroStatus, onlineSynchroFreigabe);
    }
}
