package com.atm.nubefact.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Company {

    private Long id;

    private String taxId;
    private String legalName;
    private String tradeName;

    private Boolean isActive;
}