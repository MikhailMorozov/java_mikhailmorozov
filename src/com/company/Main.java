package com.company;

import com.company.testmoney.Atm;
import com.company.testmoney.Card;
import com.company.testmoney.CreditCard;
import com.company.testmoney.DebitCard;

public class Main {

    public static void main(String[] args) {

        Card card1 = new DebitCard("Иванов");
        //Card card1 = new CreditCard("Иванов");

        Atm atm1 = new Atm(card1);

        atm1.deposit(500);
        atm1.withdrawal(300);
        System.out.println(card1.getBalance());
        atm1.showBalancrOtherCurrency();

    }
}
