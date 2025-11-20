package com.atm.nubefact.infrastructure.persistance.company.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "company_nubefact")
@Getter
@Setter
public class CompanyNubefactEntity {

    @Id
    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "nubefact_url", nullable = false, length = 255)
    private String nubefactUrl;

    @Column(name = "nubefact_token", nullable = false, length = 255)
    private String nubefactToken;

    @Column(name = "nubefact_email", nullable = false, length = 255)
    private String nubefactEmail;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
