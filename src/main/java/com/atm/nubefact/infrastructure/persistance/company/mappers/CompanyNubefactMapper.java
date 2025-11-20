package com.atm.nubefact.infrastructure.persistance.company.mappers;

import com.atm.nubefact.domain.company.model.CompanyNubefact;
import com.atm.nubefact.infrastructure.persistance.company.entities.CompanyNubefactEntity;

public class CompanyNubefactMapper {
    public static CompanyNubefact toDomain(CompanyNubefactEntity e) {
        return CompanyNubefact.builder()
                .companyId(e.getCompanyId())
                .nubefactUrl(e.getNubefactUrl())
                .nubefactToken(e.getNubefactToken())
                .build();
    }

}
