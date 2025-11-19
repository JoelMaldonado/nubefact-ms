package com.atm.nubefact.api.auth.controller;

import com.atm.nubefact.api.auth.request.ApiKeyAuthRequest;
import com.atm.nubefact.api.auth.response.TokenResponse;
import com.atm.nubefact.application.auth.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<TokenResponse> authenticate(
            @RequestBody ApiKeyAuthRequest request
    ) {
        var response = authService.authenticate(request.getApiKey());
        return ResponseEntity.ok(response);
    }
}
