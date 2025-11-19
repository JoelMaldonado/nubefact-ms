package com.atm.nubefact.api.auth.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenResponse {
    private String token;
    private long expiresInSeconds;
}
