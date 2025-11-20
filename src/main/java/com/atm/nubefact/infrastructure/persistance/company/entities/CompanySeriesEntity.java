package com.atm.nubefact.infrastructure.persistance.company.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "company_series")
@Getter
@Setter
public class CompanySeriesEntity {

    @Id
    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "invoice_series", nullable = false, length = 10)
    private String invoiceSeries;

    @Column(name = "invoice_next_number", nullable = false)
    private int invoiceNextNumber;

    @Column(name = "receipt_series", nullable = false, length = 10)
    private String receiptSeries;

    @Column(name = "receipt_next_number", nullable = false)
    private int receiptNextNumber;

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
