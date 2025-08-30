import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account one = new Account("h-kneisler", "Hermann", "Kneisler", AccountType.STUDENT);
        Account two = new Account("i-kneisler", "Ioanna", "Kneisler", AccountType.DEBIT, 600.8);
        Account three = new Account("i-kneisler", "Ioanna", "Kneisler", AccountType.DEBIT, 6022220.8);

        AccountList accountList = new AccountList();
        accountList.addAccount(one);
        accountList.addAccount(two);
        accountList.addAccount(three);

        new FinanceManager(accountList);
    }
}
