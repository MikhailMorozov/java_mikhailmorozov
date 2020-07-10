package com.company.testmoney;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard(String nameSurname, BigDecimal balance) {
        super(nameSurname, balance);
    }

    @Override
    public void decreaseBalance(BigDecimal amount) {
        balance.subtract(amount);
    }
}