package com.atm.nubefact.infrastructure.persistance.document.repositories;

import com.atm.nubefact.infrastructure.persistance.document.entities.DocumentItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentItemJpaRepository extends JpaRepository<DocumentItemEntity, Long> {
}
