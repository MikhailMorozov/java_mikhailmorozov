package com.company.testmoney;

import java.math.BigDecimal;

public class Atm {

    Card cardIn;

    public Atm(Card cardIn){
        this.cardIn = cardIn;
    }

    public void deposit (double amount){
        cardIn.increaseBalance(amount);
    }

    public void withdrawal (double  amount){
        cardIn.decreaseBalance(amount);
    }

    public void showBalancrOtherCurrency (){
        cardIn.exchangeBalance();
    }






}
