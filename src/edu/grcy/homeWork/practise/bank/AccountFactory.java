package edu.grcy.homeWork.practise.bank;

public class AccountFactory {


    public static Account getAccount(String shortcut, String name) {
        if (AccountType.getByShortcut(shortcut) != null) {
            return new Account(name, shortcut);
        }
        return null;
    }
}
