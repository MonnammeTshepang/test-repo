package cdc.dddg;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class KmnrService {

    final KmnrRepository kmnrRepository;

    @Inject
    public KmnrService(KmnrRepository kmnrRepository) {
        this.kmnrRepository = kmnrRepository;
    }

    public List<Kmnr> findAll() {
        return this.kmnrRepository.findAll();
    }

    public List<Kmnr> getKmnrs() {
        List<Kmnr> kmnrs = this.kmnrRepository.findKmnrs();
        return kmnrs;
    }

    public Optional<Kmnr> findByKmnr(String kmnr) {
        return this.kmnrRepository.findById(kmnr);
    }
}

