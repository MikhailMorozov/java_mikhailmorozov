package com.company.testmoney;

public class Atm {

    private Card cardIn;

    public Atm(Card cardIn) {
        this.cardIn = cardIn;
    }

    public void deposit(double amount)  {
        try {
            cardIn.increaseBalance(amount);
        } catch (NegativeAmountException e) {
            System.out.println("ОТРИЦАТЕЛЬНАЯ СУММА ПОПОЛНИЯ " + e.getAmount());
        }
    }

    public void withdrawal(double amount) {
        try {
            cardIn.decreaseBalance(amount);
        } catch (WithdrawalMoreBalanceException e) {
            System.out.println("много захотел " + e.getAmount());
        }
    }

    public void showBalancrOtherCurrency() {
        cardIn.exchangeBalance();
    }

}
