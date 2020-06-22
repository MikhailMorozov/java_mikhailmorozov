package com.company.testmoney;

public class DebitCard extends CardImp{

    public DebitCard(String nameSurname, int balance) {
        super(nameSurname, balance);
    }

    @Override
    public void increaseBalance(double amount) {
        balance += amount;
    }

    @Override
    public void decreaseBalance(double amount) {
        balance -= amount;

    }

    public double getBalance (){
        return balance;
    }


}
