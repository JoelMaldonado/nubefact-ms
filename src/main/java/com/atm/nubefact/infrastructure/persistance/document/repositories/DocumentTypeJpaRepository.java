package com.atm.nubefact.infrastructure.persistance.document.repositories;

import com.atm.nubefact.infrastructure.persistance.document.entities.DocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTypeJpaRepository extends JpaRepository<DocumentTypeEntity, Long> {
}
