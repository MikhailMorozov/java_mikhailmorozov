package com.company.testmoney;

import java.math.BigDecimal;

public class NegativeAmountException extends RuntimeException {
    private BigDecimal amount;

    public NegativeAmountException(BigDecimal amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
