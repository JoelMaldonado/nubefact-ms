package com.atm.nubefact.infrastructure.nubefact.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NubefactItemRequest {

    private String unidad_de_medida;
    private String codigo;
    private String codigo_producto_sunat;
    private String descripcion;
    private Double cantidad;
    private Double valor_unitario;
    private Double precio_unitario;
    private Double subtotal;
    private Integer tipo_de_igv;
    private Double igv;
    private Double total;
}