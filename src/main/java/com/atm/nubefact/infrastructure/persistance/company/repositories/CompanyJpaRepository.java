package com.atm.nubefact.infrastructure.persistance.company.repositories;

import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> {
}