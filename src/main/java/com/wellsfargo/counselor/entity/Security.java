package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Integer quantity;

    public Security(String name, String category, Date purchaseDate, Float purchasePrice, Integer quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    public Date purchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate() {
        this.purchaseDate = purchaseDate;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice() {
        this.purchasePrice = purchasePrice;
    }
}
