package jan;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Beispiel-Datenbank
        Bank bank = new Bank();

        Customer alice = new Customer("Alice");
        alice.addAccount(new Account("DE001", AccountType.CHECKING, 1200));
        alice.addAccount(new Account("DE002", AccountType.SAVINGS, 5000));

        Customer bob = new Customer("Bob");
        bob.addAccount(new Account("DE003", AccountType.CREDIT, -2000));
        bob.addAccount(new Account("DE004", AccountType.CHECKING, 800));

        Customer charlie = new Customer("Charlie");
        charlie.addAccount(new Account("DE005", AccountType.SAVINGS, 3000));

        bank.addCustomer(alice);
        bank.addCustomer(bob);
        bank.addCustomer(charlie);

        List<String> user_1 = bank.getCustomers().stream()
                .map(Customer::getName)
                .filter(name -> name.toLowerCase().contains("e"))
                .toList();
        System.out.println(user_1);


        List<String> user_2 = bank.getCustomers().stream()
                    .filter(x -> x.getAccounts().stream().anyMatch(n -> n.getBalance() >= 1000))
                .map(x -> x.getName())
                            .toList();


        System.out.println(user_2);

    }
}
