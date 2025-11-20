package com.atm.nubefact.application.auth.service;

import com.atm.nubefact.api.auth.response.TokenResponse;
import com.atm.nubefact.application.company.usecases.ValidateCompanyKeyUseCase;
import com.atm.nubefact.infrastructure.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private final ValidateCompanyKeyUseCase validateCompanyKeyUseCase;
    private final JwtUtil jwtUtil;

    public AuthService(
            ValidateCompanyKeyUseCase validateCompanyKeyUseCase,
            JwtUtil jwtUtil
    ) {
        this.validateCompanyKeyUseCase = validateCompanyKeyUseCase;
        this.jwtUtil = jwtUtil;
    }


    public TokenResponse authenticate(String apiKey) {
        var client = validateCompanyKeyUseCase.execute(apiKey);
        int minutesToExpire = 5;

        String token = jwtUtil.generateToken(client.getCompanyId(), minutesToExpire);

        return TokenResponse.builder()
                .token(token)
                .expiresInSeconds(minutesToExpire * 60)
                .build();
    }
}
