package com.atm.nubefact.application.document.usecases;

import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.domain.document.repository.DocumentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllDocumentUseCase {

    private final DocumentRepository documentRepository;

    public GetAllDocumentUseCase(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> execute(Long companyId) {
        return documentRepository.findAllByCompanyId(companyId);
    }
}
