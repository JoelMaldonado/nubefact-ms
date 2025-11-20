package com.atm.nubefact.infrastructure.persistance.company.repositories;

import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyNubefactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyNubefactJpaRepository extends JpaRepository<CompanyNubefactEntity, Long> {
    Optional<CompanyNubefactEntity> findByCompanyId(Long companyId);
}
