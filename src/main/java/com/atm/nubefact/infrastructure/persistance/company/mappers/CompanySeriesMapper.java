package com.atm.nubefact.infrastructure.persistance.company.mappers;

import com.atm.nubefact.domain.company.model.CompanySeries;
import com.atm.nubefact.infrastructure.persistance.company.entities.CompanySeriesEntity;

public class CompanySeriesMapper {
    public static CompanySeries toDomain(CompanySeriesEntity e) {
        return CompanySeries.builder()
                .companyId(e.getCompanyId())
                .invoiceSeries(e.getInvoiceSeries())
                .invoiceNextNumber(e.getInvoiceNextNumber())
                .receiptSeries(e.getReceiptSeries())
                .receiptNextNumber(e.getReceiptNextNumber())
                .build();
    }

}
