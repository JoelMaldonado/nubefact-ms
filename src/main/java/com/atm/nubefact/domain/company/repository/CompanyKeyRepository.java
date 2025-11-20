package com.atm.nubefact.domain.company.repository;

import com.atm.nubefact.domain.company.model.CompanyKey;

import java.util.Optional;

public interface CompanyKeyRepository {

    Optional<CompanyKey> findByApiKeyHash(String apiKeyHash);

}
