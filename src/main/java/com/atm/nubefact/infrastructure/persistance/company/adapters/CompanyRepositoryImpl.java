package com.atm.nubefact.infrastructure.persistance.company.adapters;

import com.atm.nubefact.domain.company.model.Company;
import com.atm.nubefact.domain.company.repository.CompanyRepository;
import com.atm.nubefact.infrastructure.persistance.company.mappers.CompanyMapper;
import com.atm.nubefact.infrastructure.persistance.company.repositories.CompanyJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

    private final CompanyJpaRepository jpa;

    public CompanyRepositoryImpl(CompanyJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public List<Company> findAll() {
        return jpa.findAll()
                .stream()
                .map(CompanyMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Company> findById(Long id) {
        return jpa.findById(id)
                .map(CompanyMapper::toDomain);
    }
}
