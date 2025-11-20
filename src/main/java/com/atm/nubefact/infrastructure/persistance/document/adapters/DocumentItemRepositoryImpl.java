package com.atm.nubefact.infrastructure.persistance.document.adapters;

import com.atm.nubefact.domain.document.repository.DocumentItemRepository;
import com.atm.nubefact.infrastructure.persistance.document.repositories.DocumentItemJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DocumentItemRepositoryImpl implements DocumentItemRepository {


    private final DocumentItemJpaRepository jpa;

    public DocumentItemRepositoryImpl(DocumentItemJpaRepository jpa) {
        this.jpa = jpa;
    }


}
