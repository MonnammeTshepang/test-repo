package cdc.dddg;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
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

    public List<KmnrDto> getKmnrs() {
        List<Kmnr> kmnrs = this.kmnrRepository.findKmnrs();
        return kmnrs.stream().map(KmnrService::convert).collect(Collectors.toList());
    }

    private static KmnrDto convert(Kmnr kmnr) {
        return new KmnrDto(kmnr.getKmnr(), kmnr.getKmabtlung(), kmnr.getDtanl(), kmnr.getKotxt(), kmnr.getKogr(), kmnr.getStand(), kmnr.getTxtes(), kmnr.getZeTermin());
    }
}

