package com.company.testmoney;

public class DebitCard extends CardImp{

    public DebitCard(String nameSurname, int balance) {
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
