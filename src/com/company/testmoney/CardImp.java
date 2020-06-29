package com.company.testmoney;

import java.math.BigDecimal;

public abstract class CardImp implements Card {
    protected String nameSurname;
    protected double balance;
    protected double amount;


    public CardImp(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public CardImp(String nameSurname, double balance) {
        this.nameSurname = nameSurname;
        this.balance = balance;
    }

    public abstract void increaseBalance(double amount);

    public abstract void decreaseBalance(double amount);

    public abstract void exchangeBalance();

    public abstract double getBalance();


}
