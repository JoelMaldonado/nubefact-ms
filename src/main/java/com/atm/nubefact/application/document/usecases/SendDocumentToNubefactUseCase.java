package com.atm.nubefact.application.document.usecases;

import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.domain.nubefact.model.NubefactResult;
import com.atm.nubefact.domain.nubefact.repository.NubefactRepository;
import org.springframework.stereotype.Component;

@Component
public class SendDocumentToNubefactUseCase {

    private final NubefactRepository nubefactRepository;

    public SendDocumentToNubefactUseCase(NubefactRepository nubefactRepository) {
        this.nubefactRepository = nubefactRepository;
    }

    public NubefactResult execute(Document document) {
        return nubefactRepository.sendDocument(document);
    }

}
