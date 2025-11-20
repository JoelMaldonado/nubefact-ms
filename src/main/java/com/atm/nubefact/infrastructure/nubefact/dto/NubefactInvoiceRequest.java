package com.atm.nubefact.infrastructure.nubefact.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class NubefactInvoiceRequest {
    private String operacion;
    private Integer tipo_de_comprobante;
    private String serie;
    private Integer numero;
    private Integer sunat_transaction;
    private List<NubefactItemRequest> items;
}