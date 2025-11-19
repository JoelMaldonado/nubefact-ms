package com.atm.nubefact.api.company.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyResponse {
    private Long id;
    private String taxId;
    private String legalName;
    private String tradeName;
    private Boolean isActive;
}