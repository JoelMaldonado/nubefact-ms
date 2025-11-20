package com.atm.nubefact.infrastructure.persistance.company.adapters;

import com.atm.nubefact.domain.company.model.CompanyKey;
import com.atm.nubefact.domain.company.repository.CompanyKeyRepository;
import com.atm.nubefact.infrastructure.persistance.company.mappers.CompanyKeyMapper;
import com.atm.nubefact.infrastructure.persistance.company.repositories.CompanyKeyJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyKeyRepositoryImpl implements CompanyKeyRepository {

    private final CompanyKeyJpaRepository jpa;

    public CompanyKeyRepositoryImpl(CompanyKeyJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Optional<CompanyKey> findByApiKeyHash(String apiKeyHash) {
        return jpa.findByApiKeyHash(apiKeyHash).map(CompanyKeyMapper::toDomain);
    }

}
