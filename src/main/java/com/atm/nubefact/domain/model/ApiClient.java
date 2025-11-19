package com.atm.nubefact.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ApiClient {

    private Long id;

    private String name;
    private String description;

    private Boolean isActive;
}