package cdc.dddg.model;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Map;


@Mapper(componentModel = "cdi")
public interface KdtMapper {

    @Mapping(source = "prfdat", target = "prfdat", dateFormat = "yyyy-MM-dd HH.mm.ss.SSSSSS")
    @Mapping(source = "archiv_kz", target = "archivKz")
    @Mapping(source = "kost_rel_kz", target = "kostRelKz")
    @Mapping(source = "mig_kz", target = "migKz")
    @Mapping(source = "neuan_uid", target = "neuanUid")
    @Mapping(source = "online_synchro_freigabe", target = "onlineSynchroFreigabe")
    @Mapping(source = "online_synchro_status", target = "onlineSynchroStatus")
    @Mapping(source = "pep_phase", target = "pepPhase")
    @Mapping(source = "pkr_kz", target = "pkrKz")
    @Mapping(source = "q_risiko", target = "qRisiko")
    @Mapping(source = "se_termin", target = "seTermin")
    @Mapping(source = "software_kz", target = "softwareKz")
    @Mapping(source = "telefonnr_anleger", target = "telefonnrAnleger")
    @Mapping(source = "telefonnr_bearbeiter", target = "telefonnrBearbeiter")
    @Mapping(source = "umdreh_kz", target = "umdrehKz")
    @Mapping(source = "ze_termin", target = "zeTermin")
    @Mapping(source = "ziel_termin", target = "zielTermin")
    Tkdn01 mapTkdn01(Map<String, String> srcMap);

    //----------- TKDA05 -----------------
    @Mapping(target = "tkda05PK", ignore = true)
    Tkda05 mapTkda05(Map<String, String> srcMap);

    @AfterMapping
    default void Tkda05Id(@MappingTarget Tkda05 tkda05, Map<String, String> map) {
        tkda05.setTkda05PK(mapTkda05PK(map));
    }

    Tkda05PK mapTkda05PK(Map<String, String> map);

    //----------- TKDA10 -----------------
    @Mapping(source = "lackart_alt", target = "lackartAlt")
    Tkda10 mapTkda10(Map<String, String> srcMap);

    @Mapping(source = "archiv_datum", target = "archivDatum")
    @Mapping(source = "archiv_id", target = "archivId")
    @Mapping(source = "archiv_kz", target = "archivKz")
    @Mapping(source = "b_typ_kz", target = "bTypKz")
    @Mapping(source = "elektr_rw", target = "elektrRw")
    @Mapping(source = "typ_altv", target = "typAltv")
    Tkdy01 mapTkdy01(Map<String, String> srcMap);
}
