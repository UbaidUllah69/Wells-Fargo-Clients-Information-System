package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String creationDate) {
        this.setCreationDate(creationDate);
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(long portfolioID) {
        this.portfolioID = portfolioID;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
