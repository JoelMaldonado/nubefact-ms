package com.atm.nubefact.infrastructure.persistance.document.mappers;

import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.infrastructure.persistance.document.entities.DocumentEntity;

public class DocumentMapper {
    public static Document toDomain(DocumentEntity e){
        return Document.builder()
                .id(e.getId())
                .build();
    }
}
