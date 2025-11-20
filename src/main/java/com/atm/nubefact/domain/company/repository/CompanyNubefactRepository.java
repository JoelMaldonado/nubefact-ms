package com.atm.nubefact.domain.company.repository;

import com.atm.nubefact.domain.company.model.CompanyNubefact;

public interface CompanyNubefactRepository {
    CompanyNubefact findByCompanyId(Long companyId);
}
