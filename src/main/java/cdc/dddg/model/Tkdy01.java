package cdc.dddg.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(schema = "kdt", name = "tkdy01")
public class Tkdy01 {
    private String typnr;
    private String abgas;
    private String antri;
    private LocalDate ausdt;
    private LocalDate eindt;
    private String getri;
    private BigDecimal hubr;
    private String karos;
    private int leist;
    private String lenk;
    private String tsart;
    private String terkz;
    private BigInteger tuer;
    private String kzstu;
    private String model;
    private String bemer;
    private String ausst;
    private LocalDate anlag;
    private String gehkz;
    private String ebezd;
    private String land;
    private LocalDate aendg;
    private String modja;
    private LocalDate guelt;
    private String motor;
    private String ebaur;
    private String star;
    private String auflad;
    private String leity;
    private String auttyp;
    private String archivKz;
    private LocalDate archivDatum;
    private String archivId;
    private String alltyp;
    private String fzgtyp;
    private String bTypKz;
    private String pseudo;
    private String motorvar;
    private String prodart;
    private String typart;
    private String typhist;
    private String typAltv;
    private String typsrt;
    private String hybrid;
    private String montageland;
    private String elektrRw;
    private String fahrzeugdif;
    private String basisausf;
    private String msport;

    @Id
    @Column(name = "typnr", nullable = false, length = 4)
    public String getTypnr() {
        return typnr;
    }

    public void setTypnr(String typnr) {
        this.typnr = typnr;
    }

    @Basic
    @Column(name = "abgas", nullable = false, length = 3)
    public String getAbgas() {
        return abgas;
    }

    public void setAbgas(String abgas) {
        this.abgas = abgas;
    }

    @Basic
    @Column(name = "antri", nullable = false, length = 6)
    public String getAntri() {
        return antri;
    }

    public void setAntri(String antri) {
        this.antri = antri;
    }

    @Basic
    @Column(name = "ausdt", nullable = true)
    public LocalDate getAusdt() {
        return ausdt;
    }

    public void setAusdt(LocalDate ausdt) {
        this.ausdt = ausdt;
    }

    @Basic
    @Column(name = "eindt", nullable = true)
    public LocalDate getEindt() {
        return eindt;
    }

    public void setEindt(LocalDate eindt) {
        this.eindt = eindt;
    }

    @Basic
    @Column(name = "getri", nullable = false, length = 4)
    public String getGetri() {
        return getri;
    }

    public void setGetri(String getri) {
        this.getri = getri;
    }

    @Basic
    @Column(name = "hubr", nullable = false, precision = 2)
    public BigDecimal getHubr() {
        return hubr;
    }

    public void setHubr(BigDecimal hubr) {
        this.hubr = hubr;
    }

    @Basic
    @Column(name = "karos", nullable = false, length = 6)
    public String getKaros() {
        return karos;
    }

    public void setKaros(String karos) {
        this.karos = karos;
    }

    @Basic
    @Column(name = "leist", nullable = false, precision = 0)
    public int getLeist() {
        return leist;
    }

    public void setLeist(int leist) {
        this.leist = leist;
    }

    @Basic
    @Column(name = "lenk", nullable = false, length = 2)
    public String getLenk() {
        return lenk;
    }

    public void setLenk(String lenk) {
        this.lenk = lenk;
    }

    @Basic
    @Column(name = "tsart", nullable = false, length = 3)
    public String getTsart() {
        return tsart;
    }

    public void setTsart(String tsart) {
        this.tsart = tsart;
    }

    @Basic
    @Column(name = "terkz", nullable = false, length = -1)
    public String getTerkz() {
        return terkz;
    }

    public void setTerkz(String terkz) {
        this.terkz = terkz;
    }

    @Basic
    @Column(name = "tuer", nullable = false, precision = 0)
    public BigInteger getTuer() {
        return tuer;
    }

    public void setTuer(BigInteger tuer) {
        this.tuer = tuer;
    }

    @Basic
    @Column(name = "kzstu", nullable = false, length = -1)
    public String getKzstu() {
        return kzstu;
    }

    public void setKzstu(String kzstu) {
        this.kzstu = kzstu;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 8)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "bemer", nullable = false, length = 60)
    public String getBemer() {
        return bemer;
    }

    public void setBemer(String bemer) {
        this.bemer = bemer;
    }

    @Basic
    @Column(name = "ausst", nullable = false, length = 8)
    public String getAusst() {
        return ausst;
    }

    public void setAusst(String ausst) {
        this.ausst = ausst;
    }

    @Basic
    @Column(name = "anlag", nullable = true)
    public LocalDate getAnlag() {
        return anlag;
    }

    public void setAnlag(LocalDate anlag) {
        this.anlag = anlag;
    }

    @Basic
    @Column(name = "gehkz", nullable = false, length = -1)
    public String getGehkz() {
        return gehkz;
    }

    public void setGehkz(String gehkz) {
        this.gehkz = gehkz;
    }

    @Basic
    @Column(name = "ebezd", nullable = false, length = 4)
    public String getEbezd() {
        return ebezd;
    }

    public void setEbezd(String ebezd) {
        this.ebezd = ebezd;
    }

    @Basic
    @Column(name = "land", nullable = false, length = 3)
    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Basic
    @Column(name = "aendg", nullable = true)
    public LocalDate getAendg() {
        return aendg;
    }

    public void setAendg(LocalDate aendg) {
        this.aendg = aendg;
    }

    @Basic
    @Column(name = "modja", nullable = false, length = 4)
    public String getModja() {
        return modja;
    }

    public void setModja(String modja) {
        this.modja = modja;
    }

    @Basic
    @Column(name = "guelt", nullable = true)
    public LocalDate getGuelt() {
        return guelt;
    }

    public void setGuelt(LocalDate guelt) {
        this.guelt = guelt;
    }

    @Basic
    @Column(name = "motor", nullable = false, length = 6)
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Basic
    @Column(name = "ebaur", nullable = false, length = 4)
    public String getEbaur() {
        return ebaur;
    }

    public void setEbaur(String ebaur) {
        this.ebaur = ebaur;
    }

    @Basic
    @Column(name = "star", nullable = true, length = 6)
    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Basic
    @Column(name = "auflad", nullable = false, length = 8)
    public String getAuflad() {
        return auflad;
    }

    public void setAuflad(String auflad) {
        this.auflad = auflad;
    }

    @Basic
    @Column(name = "leity", nullable = true, length = 4)
    public String getLeity() {
        return leity;
    }

    public void setLeity(String leity) {
        this.leity = leity;
    }

    @Basic
    @Column(name = "auttyp", nullable = true, length = 4)
    public String getAuttyp() {
        return auttyp;
    }

    public void setAuttyp(String auttyp) {
        this.auttyp = auttyp;
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
    @Column(name = "archiv_datum", nullable = true)
    public LocalDate getArchivDatum() {
        return archivDatum;
    }

    public void setArchivDatum(LocalDate archivDatum) {
        this.archivDatum = archivDatum;
    }

    @Basic
    @Column(name = "archiv_id", nullable = true, length = 3)
    public String getArchivId() {
        return archivId;
    }

    public void setArchivId(String archivId) {
        this.archivId = archivId;
    }

    @Basic
    @Column(name = "alltyp", nullable = true, length = 4)
    public String getAlltyp() {
        return alltyp;
    }

    public void setAlltyp(String alltyp) {
        this.alltyp = alltyp;
    }

    @Basic
    @Column(name = "fzgtyp", nullable = true, length = 4)
    public String getFzgtyp() {
        return fzgtyp;
    }

    public void setFzgtyp(String fzgtyp) {
        this.fzgtyp = fzgtyp;
    }

    @Basic
    @Column(name = "b_typ_kz", nullable = true, length = -1)
    public String getbTypKz() {
        return bTypKz;
    }

    public void setbTypKz(String bTypKz) {
        this.bTypKz = bTypKz;
    }

    @Basic
    @Column(name = "pseudo", nullable = true, length = -1)
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Basic
    @Column(name = "motorvar", nullable = true, length = 3)
    public String getMotorvar() {
        return motorvar;
    }

    public void setMotorvar(String motorvar) {
        this.motorvar = motorvar;
    }

    @Basic
    @Column(name = "prodart", nullable = true, length = -1)
    public String getProdart() {
        return prodart;
    }

    public void setProdart(String prodart) {
        this.prodart = prodart;
    }

    @Basic
    @Column(name = "typart", nullable = true, length = -1)
    public String getTypart() {
        return typart;
    }

    public void setTypart(String typart) {
        this.typart = typart;
    }

    @Basic
    @Column(name = "typhist", nullable = true, length = -1)
    public String getTyphist() {
        return typhist;
    }

    public void setTyphist(String typhist) {
        this.typhist = typhist;
    }

    @Basic
    @Column(name = "typ_altv", nullable = true, length = 4)
    public String getTypAltv() {
        return typAltv;
    }

    public void setTypAltv(String typAltv) {
        this.typAltv = typAltv;
    }

    @Basic
    @Column(name = "typsrt", nullable = true, length = 10)
    public String getTypsrt() {
        return typsrt;
    }

    public void setTypsrt(String typsrt) {
        this.typsrt = typsrt;
    }

    @Basic
    @Column(name = "hybrid", nullable = true, length = 4)
    public String getHybrid() {
        return hybrid;
    }

    public void setHybrid(String hybrid) {
        this.hybrid = hybrid;
    }

    @Basic
    @Column(name = "montageland", nullable = true, length = 3)
    public String getMontageland() {
        return montageland;
    }

    public void setMontageland(String montageland) {
        this.montageland = montageland;
    }

    @Basic
    @Column(name = "elektr_rw", nullable = true, length = 5)
    public String getElektrRw() {
        return elektrRw;
    }

    public void setElektrRw(String elektrRw) {
        this.elektrRw = elektrRw;
    }

    @Basic
    @Column(name = "fahrzeugdif", nullable = true, length = 2)
    public String getFahrzeugdif() {
        return fahrzeugdif;
    }

    public void setFahrzeugdif(String fahrzeugdif) {
        this.fahrzeugdif = fahrzeugdif;
    }

    @Basic
    @Column(name = "basisausf", nullable = true, length = 5)
    public String getBasisausf() {
        return basisausf;
    }

    public void setBasisausf(String basisausf) {
        this.basisausf = basisausf;
    }

    @Basic
    @Column(name = "msport", nullable = true, length = 2)
    public String getMsport() {
        return msport;
    }

    public void setMsport(String msport) {
        this.msport = msport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tkdy01 tkdy01 = (Tkdy01) o;
        return leist == tkdy01.leist && Objects.equals(typnr, tkdy01.typnr) && Objects.equals(abgas, tkdy01.abgas) && Objects.equals(antri, tkdy01.antri) && Objects.equals(ausdt, tkdy01.ausdt) && Objects.equals(eindt, tkdy01.eindt) && Objects.equals(getri, tkdy01.getri) && Objects.equals(hubr, tkdy01.hubr) && Objects.equals(karos, tkdy01.karos) && Objects.equals(lenk, tkdy01.lenk) && Objects.equals(tsart, tkdy01.tsart) && Objects.equals(terkz, tkdy01.terkz) && Objects.equals(tuer, tkdy01.tuer) && Objects.equals(kzstu, tkdy01.kzstu) && Objects.equals(model, tkdy01.model) && Objects.equals(bemer, tkdy01.bemer) && Objects.equals(ausst, tkdy01.ausst) && Objects.equals(anlag, tkdy01.anlag) && Objects.equals(gehkz, tkdy01.gehkz) && Objects.equals(ebezd, tkdy01.ebezd) && Objects.equals(land, tkdy01.land) && Objects.equals(aendg, tkdy01.aendg) && Objects.equals(modja, tkdy01.modja) && Objects.equals(guelt, tkdy01.guelt) && Objects.equals(motor, tkdy01.motor) && Objects.equals(ebaur, tkdy01.ebaur) && Objects.equals(star, tkdy01.star) && Objects.equals(auflad, tkdy01.auflad) && Objects.equals(leity, tkdy01.leity) && Objects.equals(auttyp, tkdy01.auttyp) && Objects.equals(archivKz, tkdy01.archivKz) && Objects.equals(archivDatum, tkdy01.archivDatum) && Objects.equals(archivId, tkdy01.archivId) && Objects.equals(alltyp, tkdy01.alltyp) && Objects.equals(fzgtyp, tkdy01.fzgtyp) && Objects.equals(bTypKz, tkdy01.bTypKz) && Objects.equals(pseudo, tkdy01.pseudo) && Objects.equals(motorvar, tkdy01.motorvar) && Objects.equals(prodart, tkdy01.prodart) && Objects.equals(typart, tkdy01.typart) && Objects.equals(typhist, tkdy01.typhist) && Objects.equals(typAltv, tkdy01.typAltv) && Objects.equals(typsrt, tkdy01.typsrt) && Objects.equals(hybrid, tkdy01.hybrid) && Objects.equals(montageland, tkdy01.montageland) && Objects.equals(elektrRw, tkdy01.elektrRw) && Objects.equals(fahrzeugdif, tkdy01.fahrzeugdif) && Objects.equals(basisausf, tkdy01.basisausf) && Objects.equals(msport, tkdy01.msport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typnr, abgas, antri, ausdt, eindt, getri, hubr, karos, leist, lenk, tsart, terkz, tuer, kzstu, model, bemer, ausst, anlag, gehkz, ebezd, land, aendg, modja, guelt, motor, ebaur, star, auflad, leity, auttyp, archivKz, archivDatum, archivId, alltyp, fzgtyp, bTypKz, pseudo, motorvar, prodart, typart, typhist, typAltv, typsrt, hybrid, montageland, elektrRw, fahrzeugdif, basisausf, msport);
    }
}
