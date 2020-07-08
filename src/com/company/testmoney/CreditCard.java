package com.company.testmoney;

public class CreditCard extends Card {

    public CreditCard(String nameSurname) {
        super(nameSurname);
    }

    public CreditCard(String nameSurname, BigDecimal balance) {
        super(nameSurname, balance);
    }

    @Override
    public void decreaseBalance(BigDecimal amount) {
        balance -= amount;
    }
}