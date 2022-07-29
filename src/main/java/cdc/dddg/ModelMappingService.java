package cdc.dddg;

import cdc.dddg.model.KdtMapper;
import cdc.dddg.model.QservEntities;
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
    KdtMapper kdtMapper;

    public JpaRepository getRepository(String topicName) {
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01".equals(topicName)) {
            return tkdn01Repository;
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda05".equals(topicName)) {
            return tkda05Repository;
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdy01".equals(topicName)) {
            return tkdy01Repository;
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda10".equals(topicName)) {
            return tkda10Repository;
        }

        return null;
    }

    public Function<GenericRecord, Object> getMapper(String topicName) {
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservEntities.TKDN01);
                return kdtMapper.mapTkdn01(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda05".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservEntities.TKDA05);
                return kdtMapper.mapTkda05(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkda10".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservEntities.TKDA10);
                return kdtMapper.mapTkda10(valuesMap);
            };
        }
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdy01".equals(topicName)) {
            return (record) -> {
                Map<String, String> valuesMap = recordToMap(record, QservEntities.TKDY01);
                return kdtMapper.mapTkdy01(valuesMap);
            };
        }
        return null;
    }

    private Map<String, String> recordToMap(GenericRecord genericRecord, QservEntities entName) {
        LOG.debug("msg from " + entName + " " + genericRecord.toString());
        Map<String, String> values = new HashMap<>();
        for (String field : QservEntities.getFields(entName)) {
            if (genericRecord.hasField(field) && genericRecord.get(field) != null) {
                values.put(field, genericRecord.get(field).toString());
            }
        }
        return values;
    }
}
