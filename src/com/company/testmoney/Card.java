package com.company.testmoney;

import java.math.BigDecimal;

public interface Card {

    void increaseBalance(double amount);

    void decreaseBalance(double amount);

    void exchangeBalance();

    double getBalance ();





}
