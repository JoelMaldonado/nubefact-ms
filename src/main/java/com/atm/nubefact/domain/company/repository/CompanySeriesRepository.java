package com.atm.nubefact.domain.company.repository;

import com.atm.nubefact.domain.company.model.CompanySeries;

import java.util.Optional;

public interface CompanySeriesRepository {
    Optional<CompanySeries> findByCompanyId(Long companyId);
}
