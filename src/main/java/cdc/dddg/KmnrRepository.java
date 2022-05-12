package cdc.dddg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KmnrRepository extends JpaRepository<Kmnr, String> {
    @Query("SELECT t0 FROM Kmnr t0 where t0.STAND IN ('KONZEPT', 'UNSCH', 'ABWERL', 'ANTRAG') and  t0.kmnr not like 'A%'")
    List<Kmnr> findKmnrs();

}

