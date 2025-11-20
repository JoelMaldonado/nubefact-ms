package com.atm.nubefact.domain.company.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyNubefact {
    private Long companyId;
    private String nubefactUrl;
    private String nubefactToken;
}