package com.atm.nubefact.infrastructure.persistance.document.repositories;

import com.atm.nubefact.infrastructure.persistance.document.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentJpaRepository extends JpaRepository<DocumentEntity, Long> {
   List<DocumentEntity> findAllByCompanyId(Long companyId);
}
