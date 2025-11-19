package com.atm.nubefact.api.apiclient.controller;

import com.atm.nubefact.application.apiclient.services.ApiClientService;
import com.atm.nubefact.domain.model.ApiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ApiClientController {

    private final ApiClientService apiClientService;

    public ApiClientController(ApiClientService apiClientService) {
        this.apiClientService = apiClientService;
    }

    @GetMapping
    public ResponseEntity<List<ApiClient>> getAll() {
        List<ApiClient> clients = apiClientService.getAll();
        return ResponseEntity.ok(clients);
    }
}