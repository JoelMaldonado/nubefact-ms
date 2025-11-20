package com.atm.nubefact.domain.company.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Company {

    private Long id;

    private String taxId;
    private String legalName;
    private String tradeName;

    private Boolean isActive;
}