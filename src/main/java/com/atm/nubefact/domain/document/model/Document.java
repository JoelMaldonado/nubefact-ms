package com.atm.nubefact.domain.document.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Document {

    private Long id;

    // Empresa que emite el comprobante
    private Long companyId;

    // Tipo de comprobante (boleta, factura) -> referencia a document_type
    private Long documentTypeId;

    // Datos del cliente
    private Long customerDocumentTypeId;   // DNI, RUC, etc. (tabla customer_document_type)
    private String customerDocumentNumber;
    private String customerName;
    private String customerAddress;
    private String customerEmail;

    // Datos del documento
    private String series;
    private Integer number;
    private LocalDate issueDate;

    // Moneda y montos
    private Long currencyId;              // si tienes tabla currency
    private BigDecimal amountTaxed;       // total sin IGV
    private BigDecimal amountIgv;         // solo IGV
    private BigDecimal amountTotal;       // total con IGV

    // Estado y otros
    private Long documentStatusId;        // referencia a document_status
    private String observations;

    // Items
    private List<DocumentItem> items;

}
