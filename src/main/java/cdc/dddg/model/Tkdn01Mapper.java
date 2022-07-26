package cdc.dddg.model;

import cdc.dddg.RecordMapper;
import org.apache.avro.generic.GenericRecord;

public class Tkdn01Mapper implements RecordMapper {
    @Override
    public Object map(GenericRecord genericRecord) {
        Tkdn01 tkdn01 = new Tkdn01();
        tkdn01.setKmnr(genericRecord.get("kmnr").toString());
        tkdn01.setTxtes(genericRecord.get("txtes").toString());
        tkdn01.setArchivKz(genericRecord.get("archiv_kz").toString());

        tkdn01.setAdmin("");
        tkdn01.setAgbst(0L);
        tkdn01.setKzets("");
        tkdn01.setAgbst(0);
        tkdn01.setKmpak("");
        tkdn01.setKotxt("");
        tkdn01.setKogr("");
        tkdn01.setSz("");
        tkdn01.setStand("");
        tkdn01.setErstl("");
        tkdn01.setKmabtlung("");
        tkdn01.setKzaus("");
        tkdn01.setArt("");
        tkdn01.setJahr("");
        tkdn01.setLfd("");
        tkdn01.setUmdrehKz("");
        tkdn01.setArchivKz("");
        tkdn01.setHerku("");
        tkdn01.setUidaen("");
        tkdn01.setSysanl("");
        tkdn01.setSysaen("");
        tkdn01.setPrfkz("");
        tkdn01.setAdmin("");
        tkdn01.setSoftwareKz("");
        tkdn01.setOnlineSynchroStatus("");
        tkdn01.setOnlineSynchroFreigabe("");

        return tkdn01;
    }
}
