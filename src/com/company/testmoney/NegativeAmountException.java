package com.company.testmoney;

public class NegativeAmountException extends RuntimeException {
    private double amount;

    public NegativeAmountException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
