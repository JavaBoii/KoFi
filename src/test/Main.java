package test;

import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AccountList accountList = new AccountList();


        Account one = new Account("h-kneisler", "Hermann", "Kneisler", AccountType.STUDENT);
        accountList.addAccount(one);

        Account two = new Account("i-kneisler", "Ioanna", "Kneisler", AccountType.DEBIT, 600.8);
        accountList.addAccount(two);

        Account three = new Account("i-kneisler", "Ioanna", "Kneisler", AccountType.DEBIT, 6022220.8);
        accountList.addAccount(three);

        Account five = new Account("m-kneisler", "Medina", "Kneisler", AccountType.DEBIT, 1254850.8);
        accountList.addAccount(five);

        Scanner input = new Scanner(System.in);
        System.out.print("Input username: ");
        String username = input.nextLine();

        System.out.print("Input first_name: ");
        String first_name = input.nextLine();

        System.out.print("Input last name: ");
        String last_name = input.nextLine();

        System.out.println("Type of account: [\n (1) - Debit,\n (2) - Credit,\n (3) - Student\n]");
        System.out.println("Choice: ");
        int choice = input.nextInt();
        input.nextLine();
        AccountType account_type = AccountType.INACTIVE;
        try {
            switch (choice) {
                case 1:
                    account_type = AccountType.DEBIT;
                    break;
                case 2:
                    account_type = AccountType.CREDIT;
                    break;
                case 3:
                    account_type = AccountType.STUDENT;
                    break;
                default:
                    throw new InvalidParameterException("Wrong");
            }
        } catch (Exception e) {
            System.out.println("ERROR: you have input an invalid entry");
        }

        System.out.println("Do you want to submit a balance? (y/n)");
        String q_balance = input.nextLine();
        double balance = 0;
        if (q_balance.equals("y")) {
            System.out.print("Input: ");
            balance = input.nextDouble();
        }
        System.out.println("--------- Thank you for your service -----------");
        input.close();

        Account four;
        if (balance == 0) {
            four = new Account(username, first_name, last_name, account_type);
        } else {
            four = new Account(username, first_name, last_name, account_type, balance);
        }
        accountList.addAccount(four);


        new FinanceManager(accountList);
    }
}
