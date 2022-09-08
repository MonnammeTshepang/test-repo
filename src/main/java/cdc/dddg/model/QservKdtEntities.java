package cdc.dddg.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum QservKdtEntities {
    TKDN01,
    TKDA05,
    TKDA10,
    TKDY01,
    TDBDDP,
    TDBDDC;

    private static final Map<QservKdtEntities, List<String>> FIELDS = new HashMap<>();

    static {
        FIELDS.put(TKDN01,
                   List.of("admin", "aeabschluss", "agbst", "archiv_kz", "art", "dateskz", "dtaen", "dtanl", "erstl", "herku",
                           "jahr", "kmabtlung", "kmnr", "kmpak", "kogr", "kost_rel_kz", "kotxt", "kzaus", "kzets", "laend",
                           "lfd", "mig_kz", "neuan_uid", "online_synchro_freigabe", "online_synchro_status", "pep_phase",
                           "pkr_kz", "prfdat", "prfkz", "q_risiko", "reakt", "se_termin", "software_kz", "solljj", "sollmm",
                           "solltt", "stadt", "stand", "sysaen", "sysanl", "sz", "telefonnr_anleger", "telefonnr_bearbeiter",
                           "txtes", "uidaen", "umdreh_kz", "ze_termin", "ziel_termin"));

        FIELDS.put(TKDA05, List.of("awahl", "gehkz", "gkz", "hist", "prima", "proda", "saben", "sala"));
        FIELDS.put(TKDA10, List.of("anzkz", "facod", "gkzh", "kreis", "lack", "lackart_alt", "lackverwendung", "lart", "lben"));
        FIELDS.put(TKDY01,
                   List.of("abgas", "aendg", "alltyp", "anlag", "antri", "archiv_datum", "archiv_id", "archiv_kz", "auflad",
                           "ausdt", "ausst", "auttyp", "b_typ_kz", "basisausf", "bemer", "ebaur", "ebezd", "eindt", "elektr_rw",
                           "fahrzeugdif", "fzgtyp", "gehkz", "getri", "guelt", "hubr", "hybrid", "karos", "kzstu", "land",
                           "leist", "leity", "lenk", "model", "modja", "montageland", "motor", "motorvar", "msport", "prodart",
                           "pseudo", "star", "terkz", "tsart", "tuer", "typ_altv", "typart", "typhist", "typnr", "typsrt"));
        FIELDS.put(TDBDDP, List.of("pnum", "timestamp", "plexmem"));
        FIELDS.put(TDBDDC, List.of("pnum", "timestamp", "plexmem"));
    }

    public static List<String> getFields(QservKdtEntities name) {
        return FIELDS.get(name);
    }
}
