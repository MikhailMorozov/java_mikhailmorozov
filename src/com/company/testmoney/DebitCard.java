package com.company.testmoney;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String nameSurname) {
        super(nameSurname);
    }

    public DebitCard(String nameSurname, BigDecimal balance) {
        super(nameSurname, balance);
    }

    @Override
    public void decreaseBalance (BigDecimal amount) throws WithdrawalMoreBalanceException{
        if (amount < balance){
            balance -= amount;
        } else {
            BigDecimal need = amount - balance;
            throw new WithdrawalMoreBalanceException(need);
        }
    }
}
