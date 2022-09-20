package cdc.dddg;

import cdc.dddg.dbt.model.DbtMapper;
import cdc.dddg.dbt.model.TdbddcRepository;
import cdc.dddg.dbt.model.TdbddpRepository;
import cdc.dddg.model.KdtMapper;
import cdc.dddg.model.QservKdtEntities;
import cdc.dddg.model.Tkda05Repository;
import cdc.dddg.model.Tkda10Repository;
import cdc.dddg.model.Tkdn01Repository;
import cdc.dddg.model.Tkdy01Repository;
import org.apache.avro.generic.GenericRecord;
import org.jboss.logging.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@ApplicationScoped
public class ModelMappingService {

    private static final Logger LOG = Logger.getLogger(ModelMappingService.class);

    @Inject
    Tkdn01Repository tkdn01Repository;
    @Inject
    Tkda05Repository tkda05Repository;
    @Inject
    Tkda10Repository tkda10Repository;
    @Inject
    Tkdy01Repository tkdy01Repository;
    @Inject
    TdbddpRepository tdbddpRepository;
    @Inject
    TdbddcRepository tdbddcRepository;

    @Inject
    KdtMapper kdtMapper;
    @Inject
    DbtMapper dbtMapper;

    public JpaRepository getRepository(String topicName) {
        switch (topicName) {
            case "bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01":
                return tkdn01Repository;
            case "bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda05":
                return tkda05Repository;
            case "bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdy01":
                return tkdy01Repository;
            case "bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda10":
                return tkda10Repository;
            case "bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddp":
                return tdbddpRepository;
            case "bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddc":
                return tdbddcRepository;
        }
        LOG.error("no repository found for " + topicName);
        return null;
    }

    public Function<GenericRecord, Object> getMapper(String topicName) {
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TKDN01);
                return kdtMapper.mapTkdn01(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda05".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TKDA05);
                return kdtMapper.mapTkda05(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda10".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TKDA10);
                return kdtMapper.mapTkda10(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdy01".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TKDY01);
                return kdtMapper.mapTkdy01(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddp".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TDBDDP);
                return dbtMapper.mapToTdbddp(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.dbt.tdbddc".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservKdtEntities.TDBDDC);
                return dbtMapper.mapToTdbddc(valuesMap);
            };
        }
        return null;
    }

    private Map<String, String> recordToMap(GenericRecord genericRecord, QservKdtEntities entName) {
        LOG.debug("msg from " + entName + " " + genericRecord.toString());
        Map<String, String> values = new HashMap<>();
        for (String field : QservKdtEntities.getFields(entName)) {
            if (genericRecord.hasField(field) && genericRecord.get(field) != null) {
                values.put(field, genericRecord.get(field).toString());
            }
        }
        return values;
    }
}
