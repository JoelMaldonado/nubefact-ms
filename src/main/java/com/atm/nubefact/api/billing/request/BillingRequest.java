package com.atm.nubefact.api.billing.request;

import lombok.Data;

@Data
public class BillingRequest {
    private int documentTypeId;
    private int paymentMethodId;
    private int customerDocumentType;
    private String customerDocumentNumber;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
}