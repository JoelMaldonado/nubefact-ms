package com.atm.nubefact.infrastructure.persistance.company.mappers;

import com.atm.nubefact.domain.company.model.CompanyKey;
import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyKeyEntity;

public class CompanyKeyMapper {

    public static CompanyKey toDomain(CompanyKeyEntity e) {
        return CompanyKey.builder()
                .companyId(e.getCompanyId())
                .apiKeyHash(e.getApiKeyHash())
                .build();
    }
}
