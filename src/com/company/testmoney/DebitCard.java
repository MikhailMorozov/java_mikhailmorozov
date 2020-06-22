package com.company.testmoney;

public class DebitCard extends CardImp{

    public DebitCard (){
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
