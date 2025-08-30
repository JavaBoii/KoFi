import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinanceManager {

    public FinanceManager(AccountList account) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("filename.txt");
        for (Account acc : account.getAccounts()) {
            out.println(acc);
        }
        out.close();
    }
}
