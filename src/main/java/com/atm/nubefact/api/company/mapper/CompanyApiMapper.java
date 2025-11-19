package com.atm.nubefact.api.company.mapper;

import com.atm.nubefact.api.company.dto.CompanyResponse;
import com.atm.nubefact.domain.model.Company;

public class CompanyApiMapper {

    public static CompanyResponse toResponse(Company c) {
        return CompanyResponse.builder()
                .id(c.getId())
                .taxId(c.getTaxId())
                .legalName(c.getLegalName())
                .tradeName(c.getTradeName())
                .isActive(c.getIsActive())
                .build();
    }
}