package edu.grcy.homeWork.practise.bank;

import edu.grcy.homeWork.practise.bank.interesCalculator.InteresCalculator;
import edu.grcy.homeWork.practise.bank.interesCalculator.InteresCalculatorFactory;

public class Account {
    private String accountName;
    private int balance;
    private int interesetCalculated;
    private AccountType accountType;

    public Account(String accountName, String accountType) {
        this.accountName = accountName;
        balance = 0;
        interesetCalculated = 0;
        this.accountType = AccountType.getByShortcut(accountType);
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    //geter ma słuzyc do pobrania wartosci
    public int getInteresetCalculated() {
        return interesetCalculated;
    }

    public int calculateInterest() {
        int currentInterestCalculated;
        InteresCalculator interesCalculator = InteresCalculatorFactory.getInterestCalculator(balance);
        currentInterestCalculated = interesCalculator.countInteres(balance);
        interesetCalculated += currentInterestCalculated;
        return currentInterestCalculated;

    }

    public String getAccountType() {
        return accountType.getDescripton();
    }

    public int deposit(int amount) {
        return balance += amount;
    }

    public int withDraw(int amount) {
        balance -= amount;
        return balance;
    }

    public void endOfMounth() {
        balance += interesetCalculated;
        interesetCalculated = 0;


    }

    public String getAccountInfo() {
        return new StringBuilder(accountName)
                .append(" : kapital = ")
                .append(balance)
                .append("; naliczone odsetki= ")
                .append(interesetCalculated)
                .toString();
    }

    public  void capitializeInterest() {
        balance +=interesetCalculated;
        interesetCalculated=0;
    }
}
