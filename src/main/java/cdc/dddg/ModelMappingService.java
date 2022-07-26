package cdc.dddg;

import cdc.dddg.model.Tkdn01Mapper;
import cdc.dddg.model.Tkdn01Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ModelMappingService {

    private  final Tkdn01Repository tkdn01Repository;

    @Inject
    public ModelMappingService(Tkdn01Repository tkdn01Repository) {
        this.tkdn01Repository = tkdn01Repository;
    }

    public JpaRepository getRepository(String topicName) {
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01".equals(topicName)) {
            return tkdn01Repository;
        }
        return null;
    }

    public RecordMapper getMapper (String topicName) {
        if ("bmw.mfmdd.Fertigungsstueckliste.v1.kdt.tkdn01".equals(topicName)) {
            return new Tkdn01Mapper();
        }
        return null;
    }

}
