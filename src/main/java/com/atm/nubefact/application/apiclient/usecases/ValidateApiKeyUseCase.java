package com.atm.nubefact.application.apiclient.usecases;

import com.atm.nubefact.domain.exception.UnauthorizedException;
import com.atm.nubefact.domain.model.ApiClient;
import com.atm.nubefact.domain.repository.ApiClientRepository;
import com.atm.nubefact.infrastructure.security.ApiKeyHasher;
import org.springframework.stereotype.Component;

@Component
public class ValidateApiKeyUseCase {

    private final ApiClientRepository repository;
    private final ApiKeyHasher hasher;

    public ValidateApiKeyUseCase(
            ApiClientRepository repository,
            ApiKeyHasher hasher
    ) {
        this.repository = repository;
        this.hasher = hasher;
    }

    public ApiClient execute(String apiKey) {
        String hash = hasher.hash(apiKey);

        return repository.findByApiKeyHash(hash)
                .orElseThrow(() -> new UnauthorizedException("Invalid API key"));
    }
}