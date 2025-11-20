package com.atm.nubefact.domain.company.repository;

import com.atm.nubefact.domain.company.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository {
    List<Company> findAll();

    Optional<Company> findById(Long id);

}
