package com.atm.nubefact.infrastructure.persistance.jpa.apiclient.mappers;

import com.atm.nubefact.domain.model.ApiClient;
import com.atm.nubefact.infrastructure.persistance.jpa.apiclient.entities.ApiClientEntity;

public class ApiClientMapper {

    public static ApiClient toDomain(ApiClientEntity e) {
        return ApiClient.builder()
                .id(e.getId())
                .name(e.getName())
                .description(e.getDescription())
                .isActive(e.getIsActive())
                .build();
    }
}
