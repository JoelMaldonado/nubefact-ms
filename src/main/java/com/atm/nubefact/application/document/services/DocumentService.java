package com.atm.nubefact.application.document.services;

import com.atm.nubefact.application.document.usecases.GetAllDocumentUseCase;
import com.atm.nubefact.domain.document.model.Document;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DocumentService {

    private final GetAllDocumentUseCase getAllDocumentUseCase;

    public DocumentService(GetAllDocumentUseCase getAllDocumentUseCase) {
        this.getAllDocumentUseCase = getAllDocumentUseCase;
    }

    public List<Document> getAll(Long companyId) {
        if (companyId == null) {
            return Collections.emptyList();
        }
        return getAllDocumentUseCase.execute(companyId);
    }
}
