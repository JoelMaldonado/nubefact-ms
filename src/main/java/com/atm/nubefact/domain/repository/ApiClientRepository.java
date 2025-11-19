package com.atm.nubefact.domain.repository;

import com.atm.nubefact.domain.model.ApiClient;

import java.util.List;
import java.util.Optional;

public interface ApiClientRepository {
    List<ApiClient> findAll();

    Optional<ApiClient> findById(Long id);

    Optional<ApiClient> findByApiKeyHash(String apiKeyHash);
}
