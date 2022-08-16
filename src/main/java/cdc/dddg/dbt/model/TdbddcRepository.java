package cdc.dddg.dbt.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface TdbddcRepository extends JpaRepository<Tdbddc, BigInteger> {
}
