package com.company.testmoney;

public class CreditCard extends Card {

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard(String nameSurname, double balance) {
        super(nameSurname, balance);
    }

    @Override
    public void decreaseBalance(double amount) {
        balance -= amount;
    }
}