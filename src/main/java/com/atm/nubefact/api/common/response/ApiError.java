package com.atm.nubefact.api.common.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiError {
    private String code;
    private String details;
}