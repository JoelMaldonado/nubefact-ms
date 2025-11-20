package com.atm.nubefact.infrastructure.nubefact.dto;


import lombok.Data;

@Data
public class NubefactInvoiceResponse {

    private Integer tipo_de_comprobante;
    private String serie;
    private Integer numero;
    private String enlace;
    private Boolean aceptada_por_sunat;
    private String sunat_description;
    private String sunat_note;
    private String sunat_responsecode;
    private String sunat_soap_error;
    private Boolean anulado;
    private String enlace_del_pdf;
    private String enlace_del_xml;
    private String enlace_del_cdr;
    private String cadena_para_codigo_qr;
    private String codigo_hash;
}