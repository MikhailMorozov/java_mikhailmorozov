package com.company.testmoney;

public class DebitCard extends CardImp{

    public DebitCard(String nameSurname) {
        super(nameSurname);
    }

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

    @Override
    public void exchangeBalance(double amount){
        System.out.println(balance/2.4);
    }

    public double getBalance (){
        return balance;
    }


}
