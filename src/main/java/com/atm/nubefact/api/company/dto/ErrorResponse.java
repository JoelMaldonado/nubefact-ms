package com.atm.nubefact.api.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private boolean success;
    private String message;
    private String errorCode;
    private Instant timestamp;
    private String path;
}

