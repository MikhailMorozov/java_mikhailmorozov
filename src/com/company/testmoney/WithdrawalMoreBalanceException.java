package com.company.testmoney;

public class WithdrawalMoreBalanceException extends RuntimeException {
    private double amount;

    public WithdrawalMoreBalanceException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

