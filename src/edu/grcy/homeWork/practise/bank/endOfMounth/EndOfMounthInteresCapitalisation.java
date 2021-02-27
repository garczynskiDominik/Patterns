package edu.grcy.homeWork.practise.bank.endOfMounth;

import edu.grcy.homeWork.practise.bank.Account;

import java.util.List;

public class EndOfMounthInteresCapitalisation implements EndOfMounth {

    List<Account> accounts;

    public EndOfMounthInteresCapitalisation(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void performOperation() {
        accounts.stream()
                .filter(account -> account.getInteresetCalculated()>0)
                .forEach(Account::capitializeInterest);

    }
}
