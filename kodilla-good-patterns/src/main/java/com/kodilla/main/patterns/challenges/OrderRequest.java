package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    public User user;
    public String productName;
    public String productType;
    public LocalDate transactionDate;
    public int transactionID;

    public OrderRequest(User user, String productName, String productType, LocalDate transactionDate, int transactionID) {
        this.user = user;
        this.productName = productName;
        this.productType = productType;
        this.transactionDate = transactionDate;
        this.transactionID = transactionID;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public int getTransactionID() {
        return transactionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRequest that = (OrderRequest) o;

        if (transactionID != that.transactionID) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        return transactionDate != null ? transactionDate.equals(that.transactionDate) : that.transactionDate == null;
    }

    @Override
    public int hashCode() {
        return transactionID;
    }
}

