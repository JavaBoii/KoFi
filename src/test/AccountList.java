package test;

import java.util.ArrayList;

public class AccountList {
    private ArrayList<Account> accounts;
    public AccountList() {
        accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}
