package com.atm.nubefact.domain.document.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentItem {
    private Long id;

    private Long documentId;       // opcional en dominio, pero útil a veces

    private Long unitMeasureId;    // referencia a unit_measure (NIU, ZZ, etc.)
    private String productCode;    // tu código interno
    private String sunatProductCode; // opcional, código SUNAT si lo usas
    private String description;

    private BigDecimal quantity;

    // montos por ítem
    private BigDecimal amountTaxed;   // sin IGV (subtotal)
    private BigDecimal amountIgv;     // solo IGV
    private BigDecimal amountTotal;   // con IGV
}
