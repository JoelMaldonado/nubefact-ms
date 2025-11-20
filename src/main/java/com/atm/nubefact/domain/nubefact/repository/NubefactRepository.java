package com.atm.nubefact.domain.nubefact.repository;

import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.domain.nubefact.model.NubefactResult;

public interface NubefactRepository {
    NubefactResult sendDocument(Document document);
}
