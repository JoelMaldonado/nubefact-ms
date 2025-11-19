package com.atm.nubefact.infrastructure.persistance.jpa.company.mappers;

import com.atm.nubefact.domain.model.Company;
import com.atm.nubefact.infrastructure.persistance.jpa.company.entities.CompanyEntity;

public class CompanyMapper {

    public static Company toDomain(CompanyEntity e) {
        return Company.builder()
                .id(e.getId())
                .taxId(e.getTaxId())
                .legalName(e.getLegalName())
                .tradeName(e.getTradeName())
                .isActive(e.getIsActive())
                .build();
    }
}