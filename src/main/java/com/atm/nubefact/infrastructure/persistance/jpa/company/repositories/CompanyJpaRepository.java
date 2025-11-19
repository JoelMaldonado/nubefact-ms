package com.atm.nubefact.infrastructure.persistance.jpa.company.repositories;

import com.atm.nubefact.infrastructure.persistance.jpa.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> { }