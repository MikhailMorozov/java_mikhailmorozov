package com.company.testmoney;

import java.math.BigDecimal;

public class DebitCard extends CardImp {

    public DebitCard(String nameSurname) {
        super(nameSurname);
    }

    public DebitCard(String nameSurname, double balance) {
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
    public void decreaseBalance (double amount) throws WithdrawalMoreBalanceException{
        if (amount < balance){
            balance -= amount;
        } else {
            double need = amount - balance;
            throw new WithdrawalMoreBalanceException(need);
        }


    }

    @Override
    public void exchangeBalance() {

        System.out.println(balance / 2.4);
    }

    public double getBalance() {
        return balance;
    }


}
