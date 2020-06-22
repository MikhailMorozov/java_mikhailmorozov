package com.company.testmoney;

public class CreditCard extends CardImp{

    public CreditCard (String nameSurname, int balance) {
        super(nameSurname, balance);
    }

    @Override
    public void increaseBalance() {
        balance += amount;
    }

    @Override
    public void decreaseBalance() {
        balance -= amount;

    }


}