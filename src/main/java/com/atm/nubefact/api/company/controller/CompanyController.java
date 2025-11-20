package com.atm.nubefact.api.company.controller;

import com.atm.nubefact.api.company.dto.CompanyResponse;
import com.atm.nubefact.api.company.mapper.CompanyApiMapper;
import com.atm.nubefact.application.company.services.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService service) {
        this.companyService = service;
    }

    @GetMapping
    public List<CompanyResponse> getAll() {
        return companyService.getAll()
                .stream()
                .map(CompanyApiMapper::toResponse)
                .toList();
    }

    @GetMapping("/{id}")
    public CompanyResponse getById(@PathVariable Long id) {
        return CompanyApiMapper.toResponse(
                companyService.getById(id)
        );
    }
}