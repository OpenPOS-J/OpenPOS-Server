package org.openpos.model;

import java.util.Date;
import java.util.Set;

public class Transaction extends PricingAttributes {
    private int transactionId;
    private Date transactionDate;
    private Set<SalesUnit> salesUnits;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Set<SalesUnit> getSalesUnits() {
        return salesUnits;
    }

    public void setSalesUnits(Set<SalesUnit> salesUnits) {
        this.salesUnits = salesUnits;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", salesUnits=" + salesUnits +
                '}';
    }
}
