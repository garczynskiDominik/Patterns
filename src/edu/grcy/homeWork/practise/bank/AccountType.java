package edu.grcy.homeWork.practise.bank;

public enum AccountType {
    CURRENT("c", "bieżace"),
    SAVINGS("s", "oszczednosciowe");


    private String shortcut;
    private String descrition;

    AccountType(String shortcut, String descrition) {
        this.shortcut = shortcut;
        this.descrition = descrition;
    }

    public String getDescripton() {
        return descrition;
    }


    public static AccountType getByShortcut(String shortcut){
        for(AccountType accountype : AccountType.values()){
            if (shortcut.equals(accountype.shortcut)){
                return accountype;
            }
        }
        return  null;
    }
}
