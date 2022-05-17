package cdc.dddg;

import org.apache.avro.generic.GenericRecord;

import java.time.Instant;

public class KmnrMapper {
    public KmnrMapper() {
    }

    public static Kmnr map(GenericRecord genericRecord) {
        Kmnr kmnr = new Kmnr();
        kmnr.setKmnr(genericRecord.get("kmnr").toString());
        kmnr.setTxtes(genericRecord.get("txtes").toString());
        kmnr.setKmpak(genericRecord.get("kmpak").toString());
        kmnr.setKotxt(genericRecord.get("kotxt").toString());
        kmnr.setKogr(genericRecord.get("kogr").toString());
        kmnr.setStand(genericRecord.get("stand").toString());
        kmnr.setKmabtlung(genericRecord.get("kmabtlung").toString());
        //kmnr.setDtaen(genericRecord.get("dtaen").toString());
        //kmnr.setDtanl(genericRecord.get("dtanl").toString());
        //kmnr.setZielTermin(genericRecord.get("ziel_termin").toString());
        if (genericRecord.get("ze_termin") != null) {
            kmnr.setZeTermin(genericRecord.get("ze_termin").toString());
        }
        if (genericRecord.get("se_termin") != null) {
            kmnr.setSeTermin((genericRecord.get("se_termin").toString()));
        }

        kmnr.setArt(genericRecord.get("art").toString());
        return kmnr;
    }

    public static Kmnr map(GenericRecord entry, Instant db2UTC, Instant kafkaUTC, Instant appUTC) {
        Kmnr kmnr = map(entry);
        kmnr.setDb2Timestamp(db2UTC);
        kmnr.setKafkaTimestamp(kafkaUTC);
        kmnr.setAppTimestamp(appUTC);
        return kmnr;
    }
}
