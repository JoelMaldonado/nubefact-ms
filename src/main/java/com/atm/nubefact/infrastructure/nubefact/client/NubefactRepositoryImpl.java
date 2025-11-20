package com.atm.nubefact.infrastructure.nubefact.client;

import com.atm.nubefact.domain.company.repository.CompanyNubefactRepository;
import com.atm.nubefact.domain.document.model.Document;
import com.atm.nubefact.domain.nubefact.model.NubefactResult;
import com.atm.nubefact.domain.nubefact.repository.NubefactRepository;
import com.atm.nubefact.infrastructure.nubefact.dto.NubefactInvoiceRequest;
import com.atm.nubefact.infrastructure.nubefact.dto.NubefactInvoiceResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClient;

import java.util.Collections;

@Repository
public class NubefactRepositoryImpl implements NubefactRepository {

    private final RestClient restClient;
    private final CompanyNubefactRepository companyNubefactRepository;


    public NubefactRepositoryImpl(CompanyNubefactRepository companyNubefactRepository) {
        this.restClient = RestClient.builder().build();
        this.companyNubefactRepository = companyNubefactRepository;
    }

    @Override
    public NubefactResult sendDocument(Document document) {
        NubefactInvoiceRequest request = new NubefactInvoiceRequest(
                "",
                1,
                "",
                1,
                1,
                Collections.emptyList()
        );

        var config = companyNubefactRepository.findByCompanyId(document.getCompanyId());

        NubefactInvoiceResponse response = restClient.post()
                .uri(config.getNubefactUrl())
                .header("Authorization", "Token " + config.getNubefactToken())
                .body(request)
                .retrieve()
                .body(NubefactInvoiceResponse.class);

        return NubefactResult.builder()
                .acceptedBySunat(Boolean.TRUE.equals(response.getAceptada_por_sunat()))
                .pdfUrl(response.getEnlace_del_pdf())
                .xmlUrl(response.getEnlace_del_xml())
                .qrString(response.getCadena_para_codigo_qr())
                .sunatErrorMessage(response.getSunat_soap_error())
                .build();
    }
}
