package com.atm.nubefact.infrastructure.persistance.document.adapters;

import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.domain.document.repository.DocumentRepository;
import com.atm.nubefact.infrastructure.persistance.document.mappers.DocumentMapper;
import com.atm.nubefact.infrastructure.persistance.document.repositories.DocumentJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {

    private final DocumentJpaRepository jpa;

    public DocumentRepositoryImpl(DocumentJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public List<Document> findAllByCompanyId(Long companyId) {
        return jpa.findAllByCompanyId(companyId).stream().map(DocumentMapper::toDomain).toList();
    }
}
