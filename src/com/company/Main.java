package com.company;

import com.company.testmoney.Atm;
import com.company.testmoney.CardImp;
import com.company.testmoney.CreditCard;
import com.company.testmoney.DebitCard;

public class Main {

    public static void main(String[] args) {

        CardImp card1 = new DebitCard("Иванов");
        CardImp card2 = new CreditCard("Иванов");

        Atm atm1 = new Atm(card1);

        atm1.deposit(100);
        atm1.withdrawal(300);
        System.out.println(card1.getBalance());






    }
}
