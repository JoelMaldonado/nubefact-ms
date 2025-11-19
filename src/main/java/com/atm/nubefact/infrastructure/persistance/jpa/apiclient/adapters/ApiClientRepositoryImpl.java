package com.atm.nubefact.infrastructure.persistance.jpa.apiclient.adapters;

import com.atm.nubefact.domain.model.ApiClient;
import com.atm.nubefact.domain.repository.ApiClientRepository;
import com.atm.nubefact.infrastructure.persistance.jpa.apiclient.mappers.ApiClientMapper;
import com.atm.nubefact.infrastructure.persistance.jpa.apiclient.repositories.ApiClientJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ApiClientRepositoryImpl implements ApiClientRepository {

    private final ApiClientJpaRepository jpa;

    public ApiClientRepositoryImpl(ApiClientJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public List<ApiClient> findAll() {
        return jpa.findAll()
                .stream()
                .map(ApiClientMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<ApiClient> findById(Long id) {
        return jpa.findById(id)
                .map(ApiClientMapper::toDomain);
    }

    @Override
    public Optional<ApiClient> findByApiKeyHash(String apiKeyHash) {
        return jpa.findByApiKeyHash(apiKeyHash)
                .map(ApiClientMapper::toDomain);
    }
}
