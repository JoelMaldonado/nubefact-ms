package com.atm.nubefact.infrastructure.persistance.jpa.company.adapters;

import com.atm.nubefact.domain.model.Company;
import com.atm.nubefact.domain.repository.CompanyRepository;
import com.atm.nubefact.infrastructure.persistance.jpa.company.mappers.CompanyMapper;
import com.atm.nubefact.infrastructure.persistance.jpa.company.repositories.CompanyJpaRepository;
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
