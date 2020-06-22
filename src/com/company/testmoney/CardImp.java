package com.company.testmoney;

public abstract class CardImp implements Card{
    public String nameSurname;
    public double balance;
    public double amount;

    public CardImp(String nameSurname, double balance) {
        this.nameSurname = nameSurname;
        this.balance = balance;
    }

    public abstract void increaseBalance(double amount);

    public abstract void decreaseBalance(double amount);

    public abstract double getBalance ();


}
