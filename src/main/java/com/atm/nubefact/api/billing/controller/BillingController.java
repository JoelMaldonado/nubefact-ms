package com.atm.nubefact.api.billing.controller;

import com.atm.nubefact.api.billing.request.BillingRequest;
import com.atm.nubefact.api.common.response.ApiResponse;
import com.atm.nubefact.api.common.response.ResponseFactory;
import com.atm.nubefact.application.billing.service.BillingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<String>> create(
            @RequestBody BillingRequest request
    ) {
        String res = billingService.create();
        return ResponseEntity.ok(ResponseFactory.success("Pruebita", res));
    }
}
