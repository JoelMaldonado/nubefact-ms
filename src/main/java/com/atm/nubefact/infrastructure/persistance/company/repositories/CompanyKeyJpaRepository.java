package com.atm.nubefact.infrastructure.persistance.company.repositories;

import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyKeyJpaRepository  extends JpaRepository<CompanyKeyEntity, Long> {

    Optional<CompanyKeyEntity> findByApiKeyHash(String apiKeyHash);
}
