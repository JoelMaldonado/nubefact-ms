package com.atm.nubefact.infrastructure.persistance.jpa.apiclient.repositories;

import com.atm.nubefact.infrastructure.persistance.jpa.apiclient.entities.ApiClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiClientJpaRepository extends JpaRepository<ApiClientEntity, Long> {
    Optional<ApiClientEntity> findByApiKeyHash(String apiKeyHash);
}