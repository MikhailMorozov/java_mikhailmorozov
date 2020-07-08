package com.company.testmoney;


import java.math.BigDecimal;

public abstract class Card {
    protected String nameSurname;
    protected BigDecimal balance;
    protected BigDecimal amount;


    public Card(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Card(String nameSurname, BigDecimal balance) {
        this.nameSurname = nameSurname;
        this.balance = balance;
    }

    public void increaseBalance(BigDecimal amount){
        if (amount >= 0){
            balance += amount;

        } else {
            double need = amount - balance;
            throw new NegativeAmountException(need);
        }
    }

    public abstract void decreaseBalance(BigDecimal amount);

    public void exchangeBalance(){
        System.out.println(balance / 2.4);
    }

    public double getBalance(){
        return balance;
    }


}
