package com.atm.nubefact.infrastructure.persistance.document.repositories;

import com.atm.nubefact.infrastructure.persistance.document.entities.DocumentStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentStatusJpaRepository extends JpaRepository<DocumentStatusEntity, Long> {
}
