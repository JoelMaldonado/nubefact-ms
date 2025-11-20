package com.atm.nubefact.api.document.controller;

import com.atm.nubefact.api.common.response.ApiResponse;
import com.atm.nubefact.api.common.response.ResponseFactory;
import com.atm.nubefact.application.document.services.DocumentService;
import com.atm.nubefact.domain.document.model.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/document")
public class DocumentController {

    final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Document>>> getAll() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Long companyId = auth != null ? (Long) auth.getPrincipal() : null;
        var response = documentService.getAll(companyId);
        return ResponseEntity.ok(ResponseFactory.success(response));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> addDocument() {
        return ResponseEntity.ok(ResponseFactory.success("Document added successfully"));
    }
}
