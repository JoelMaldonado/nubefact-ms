package com.atm.nubefact.application.apiclient.services;

import com.atm.nubefact.domain.model.ApiClient;
import com.atm.nubefact.domain.repository.ApiClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiClientService {

    private final ApiClientRepository apiClientRepository;

    public ApiClientService(ApiClientRepository apiClientRepository) {
        this.apiClientRepository = apiClientRepository;
    }

    public List<ApiClient> getAll() {
        return apiClientRepository.findAll();
    }
}