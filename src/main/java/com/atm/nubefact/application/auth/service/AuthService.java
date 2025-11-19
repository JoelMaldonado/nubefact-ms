package com.atm.nubefact.application.auth.service;

import com.atm.nubefact.api.auth.response.TokenResponse;
import com.atm.nubefact.application.apiclient.usecases.ValidateApiKeyUseCase;
import com.atm.nubefact.infrastructure.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private final ValidateApiKeyUseCase validateApiKeyUseCase;
    private final JwtUtil jwtUtil;

    public AuthService(ValidateApiKeyUseCase validateApiKeyUseCase, JwtUtil jwtUtil) {
        this.validateApiKeyUseCase = validateApiKeyUseCase;
        this.jwtUtil = jwtUtil;
    }


    public TokenResponse authenticate(String apiKey) {
        var client = validateApiKeyUseCase.execute(apiKey);
        int minutesToExpire = 5;

        String token = jwtUtil.generateToken(client.getId(), minutesToExpire);

        return TokenResponse.builder()
                .token(token)
                .expiresInSeconds(minutesToExpire * 60)
                .build();
    }
}
