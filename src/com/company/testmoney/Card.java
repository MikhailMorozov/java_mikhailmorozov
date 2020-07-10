package com.company.testmoney;


import java.math.BigDecimal;

public abstract class Card {
    protected String nameSurname;
    protected BigDecimal balance;
    protected BigDecimal amount;


    public Card(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Card(String nameSurname, BigDecimal balance) {
        this.nameSurname = nameSurname;
        this.balance = balance;
    }

    public void increaseBalance(BigDecimal amount){

        if (amount.compareTo(BigDecimal.ZERO)>0){
            balance.add(amount);

        } else {
            BigDecimal need = amount.subtract(balance);
            throw new NegativeAmountException(need);
        }
    }

    public abstract void decreaseBalance(BigDecimal amount);

    public void exchangeBalance(){
        BigDecimal curs = new BigDecimal("2.4");
        System.out.println(balance.divide(curs));
    }

    public BigDecimal getBalance(){
        return balance;
    }


}
