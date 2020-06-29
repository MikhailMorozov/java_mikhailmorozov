package com.company.testmoney;

public class CreditCard extends CardImp{

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard (String nameSurname, int balance) {
        super(nameSurname, balance);
    }


    @Override
    public void increaseBalance(double amount) {

    }

    @Override
    public void decreaseBalance(double amount) {

    }

    @Override
    public void exchangeBalance(double amount){
        System.out.println(balance/2.4);
    }

    @Override
    public double getBalance() {
        return balance;
    }



    /*@Override
    public void increaseBalance() {
        balance += amount;
    }

    @Override
    public void decreaseBalance() {
        balance -= amount;

    }*/


}
