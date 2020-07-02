package com.company.testmoney;

public class DebitCard extends Card {

    public DebitCard(String nameSurname) {
        super(nameSurname);
    }

    public DebitCard(String nameSurname, double balance) {
        super(nameSurname, balance);
    }

    @Override
    public void decreaseBalance (double amount) throws WithdrawalMoreBalanceException{
        if (amount < balance){
            balance -= amount;
        } else {
            double need = amount - balance;
            throw new WithdrawalMoreBalanceException(need);
        }
    }
}
