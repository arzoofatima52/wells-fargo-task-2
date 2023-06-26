package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
