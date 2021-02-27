package edu.grcy.homeWork.practise.bank.interesCalculator.testingAccounts;

import edu.grcy.homeWork.practise.bank.Account;
import edu.grcy.homeWork.practise.bank.AccountFactory;
import edu.grcy.homeWork.practise.bank.interesCalculator.InteresCalculatorInit;

public class TestingAccounts {
    public static void main(String[] args) {

        InteresCalculatorInit init = new InteresCalculatorInit();
        init.interesCalculatorInut();


        int currentInterest;
        Account account1 = AccountFactory.getAccount("c", "Konto1");
        System.out.println(account1.getAccountName());
        account1.deposit(500);


        System.out.println("--------------------------------------");
        currentInterest = account1.calculateInterest();
        System.out.println(account1.getAccountInfo());
        System.out.println("Biezace odsterki dla konta: " + currentInterest);

        System.out.println("--------------------------------------");

        account1.deposit(550000);
        currentInterest = account1.calculateInterest();
        System.out.println(account1.getAccountInfo());
        System.out.println("Biezace odsetki dla konta: " + currentInterest);

        account1.endOfMounth();
        System.out.println(account1.getAccountInfo());

//
//        System.out.println("--------------------------------------");
//
//        account1.withDraw(100000);
//        currentInterest = account1.calculateInterest();
//        System.out.println(account1.getAccountInfo());
//        System.out.println("Biezace odsetki dla konta: " + currentInterest);
//
//        System.out.println("--------------------------------------");
//
//        account1.deposit(550000);
//        currentInterest = account1.calculateInterest();
//        System.out.println(account1.getAccountInfo());
//        System.out.println("Biezace odsetki dla konta: " + currentInterest);


        /**
         * dopisac klase EndOfMoth albo metode endOfMonth
         * w ktorej naliczone odsetki zostana dopisane do kwoty kapitalu
         * Po dopisaniu do kapitalu odsetki nalezy wyzerowac
         */

    }
}
