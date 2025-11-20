package com.atm.nubefact.application.company.usecases;

import com.atm.nubefact.domain.company.model.CompanyKey;
import com.atm.nubefact.domain.company.repository.CompanyKeyRepository;
import com.atm.nubefact.infrastructure.security.ApiKeyHasher;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ValidateCompanyKeyUseCase {

    private final CompanyKeyRepository companyKeyRepository;
    private final ApiKeyHasher hasher;

    public ValidateCompanyKeyUseCase(
            CompanyKeyRepository companyKeyRepository,
            ApiKeyHasher hasher
    ) {
        this.companyKeyRepository = companyKeyRepository;
        this.hasher = hasher;
    }

    public CompanyKey execute(String apiKey) {
        String hash = hasher.hash(apiKey);
        var f = companyKeyRepository.findByApiKeyHash(hash);
        if (f.isEmpty()) {
            throw new RuntimeException("Invalid API key");
        }
        return f.get();
    }
}
