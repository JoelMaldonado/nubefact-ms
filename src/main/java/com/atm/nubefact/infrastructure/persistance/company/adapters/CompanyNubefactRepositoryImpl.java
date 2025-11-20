package com.atm.nubefact.infrastructure.persistance.company.adapters;

import com.atm.nubefact.domain.company.model.CompanyNubefact;
import com.atm.nubefact.domain.company.repository.CompanyNubefactRepository;
import com.atm.nubefact.infrastructure.persistance.company.repositories.CompanyNubefactJpaRepository;
import com.atm.nubefact.infrastructure.persistance.company.mappers.CompanyNubefactMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyNubefactRepositoryImpl implements CompanyNubefactRepository {

    private final CompanyNubefactJpaRepository jpa;

    public CompanyNubefactRepositoryImpl(CompanyNubefactJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public CompanyNubefact findByCompanyId(Long companyId) {
        return jpa.findByCompanyId(companyId)
                .map(CompanyNubefactMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("No Nubefact config for company " + companyId));
    }
}
