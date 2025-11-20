package com.atm.nubefact.infrastructure.persistance.company.repositories;

import com.atm.nubefact.infrastructure.persistance.company.entities.CompanySeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanySeriesJpaRepository extends JpaRepository<CompanySeriesEntity, Long> {
    Optional<CompanySeriesEntity> findByCompanyId(Long companyId);
}
