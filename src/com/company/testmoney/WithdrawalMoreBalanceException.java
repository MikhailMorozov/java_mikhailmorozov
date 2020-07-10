package com.company.testmoney;

import java.math.BigDecimal;

public class WithdrawalMoreBalanceException extends RuntimeException {
    private BigDecimal amount;

    public WithdrawalMoreBalanceException(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}

