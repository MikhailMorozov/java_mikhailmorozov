package com.company.testmoney;

import java.math.BigDecimal;

public class CreditCard extends CardImp {

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard(String nameSurname, BigDecimal balance) {
        super(nameSurname, balance);
    }


    @Override
    public void increaseBalance(BigDecimal amount) {

    }

    @Override
    public void decreaseBalance(BigDecimal amount) {

    }

    @Override
    public void exchangeBalance() {
        System.out.println(balance / 2.4);
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }



    /*@Override
    public void increaseBalance() {
        balance += amount;
    }

    @Override
    public void decreaseBalance() {
        balance -= amount;

    }*/


}
