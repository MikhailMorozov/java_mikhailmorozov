package com.company;

import com.company.testmoney.Atm;
import com.company.testmoney.Card;
import com.company.testmoney.CreditCard;
import com.company.testmoney.DebitCard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Card card1 = new DebitCard("Иванов");
        //Card card1 = new CreditCard("Иванов");

        Atm atm1 = new Atm(card1);

        BigDecimal amoutDeposit = BigDecimal.valueOf(500);
        BigDecimal amoutWithdrawal = BigDecimal.valueOf(300);

        atm1.deposit(amoutDeposit);
        atm1.withdrawal(amoutWithdrawal);
        System.out.println(card1.getBalance());
        atm1.showBalancrOtherCurrency();

    }
}
