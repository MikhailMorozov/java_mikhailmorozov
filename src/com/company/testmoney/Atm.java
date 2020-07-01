package com.company.testmoney;

public class Atm {

    Card cardIn;

    public Atm(Card cardIn){
        this.cardIn = cardIn;
    }

    public void deposit (double amount){
        cardIn.increaseBalance(amount);
    }

    public void withdrawal (double  amount){
        try {
            cardIn.decreaseBalance(amount);
        } catch (WithdrawalMoreBalanceException e){
            System.out.println("много захотел " + e.getAmount());
        }

    }

    public void showBalancrOtherCurrency (){
        cardIn.exchangeBalance();
    }






}
