package com.atm.nubefact.infrastructure.persistance.company.adapters;

import com.atm.nubefact.domain.company.model.CompanySeries;
import com.atm.nubefact.domain.company.repository.CompanySeriesRepository;
import com.atm.nubefact.infrastructure.persistance.company.entities.CompanySeriesEntity;
import com.atm.nubefact.infrastructure.persistance.company.mappers.CompanySeriesMapper;
import com.atm.nubefact.infrastructure.persistance.company.repositories.CompanySeriesJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanySeriesRepositoryImpl implements CompanySeriesRepository {

    private final CompanySeriesJpaRepository jpa;

    public CompanySeriesRepositoryImpl(CompanySeriesJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Optional<CompanySeries> findByCompanyId(Long companyId) {
        return jpa.findByCompanyId(companyId).map(CompanySeriesMapper::toDomain);
    }
}
