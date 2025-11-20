package com.atm.nubefact.infrastructure.persistance.company.mappers;

import com.atm.nubefact.domain.company.model.Company;
import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyEntity;

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