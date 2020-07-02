package com.company.testmoney;



public abstract class Card {
    protected String nameSurname;
    protected double balance;
    protected double amount;


    public Card(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Card(String nameSurname, double balance) {
        this.nameSurname = nameSurname;
        this.balance = balance;
    }

    public void increaseBalance(double amount){
        if (amount >= 0){
            balance += amount;

        } else {
            double need = amount - balance;
            throw new NegativeAmountException(need);
        }
    }

    public abstract void decreaseBalance(double amount);

    public void exchangeBalance(){
        System.out.println(balance / 2.4);
    }

    public double getBalance(){
        return balance;
    }


}
