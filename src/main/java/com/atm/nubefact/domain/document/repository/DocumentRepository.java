package com.atm.nubefact.domain.document.repository;


import com.atm.nubefact.domain.document.model.Document;

import java.util.List;

public interface DocumentRepository {
    List<Document> findAllByCompanyId(Long companyId);
}
