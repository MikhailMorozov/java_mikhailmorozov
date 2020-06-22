package com.company.testmoney;

public class Atm {

    Card cardIn;

    public Atm(Card cardIn){
        this.cardIn = cardIn;
    }

    public void deposit (double amount){
        cardIn.increaseBalance(amount);
    }




}
