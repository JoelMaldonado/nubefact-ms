package com.atm.nubefact.domain.nubefact.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NubefactResult {

    private boolean acceptedBySunat;
    private String pdfUrl;
    private String xmlUrl;
    private String qrString;
    private String sunatErrorMessage; // null si todo bien
}