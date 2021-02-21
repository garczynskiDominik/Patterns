package edu.grcy.homeWork.practise.bank;

public class Account {
    private String accountName;
    private int balance;
    private int interesetCalculated;

    public Account(String accountName, int balance, int interesetCalculated) {
        this.accountName = accountName;
        balance = 0;
        interesetCalculated =0;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public int getInteresetCalculated() {
        return interesetCalculated;
    }

    public int deposit(int amount){
        return balance+=amount;
    }
    public  int withDraw(int amount){
        balance-=amount;
        return balance;
    }
}
