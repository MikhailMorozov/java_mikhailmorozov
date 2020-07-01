package com.company.testmoney;

import java.math.BigDecimal;

public class CreditCard extends CardImp {

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard(String nameSurname, double balance) {
        super(nameSurname, balance);
    }


    @Override
    public void increaseBalance(double amount) {
        if (amount >= 0){
            balance += amount;

        } else {
            double need = amount - balance;
            throw new NegativeAmountException(need);
        }
    }

    @Override
    public void decreaseBalance(double amount) {
        balance -= amount;
    }

    @Override
    public void exchangeBalance() {
        System.out.println(balance / 2.4);
    }

    @Override
    public double getBalance() {
        return balance;
    }





}
