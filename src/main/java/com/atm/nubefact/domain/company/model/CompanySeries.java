package com.atm.nubefact.domain.company.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanySeries {
    private Long companyId;
    private String invoiceSeries;
    private int invoiceNextNumber;
    private String receiptSeries;
    private int receiptNextNumber;
}
