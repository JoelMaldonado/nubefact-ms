package com.atm.nubefact.domain.company.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CompanyKey {
    private Long companyId;
    private String apiKeyHash;
}
