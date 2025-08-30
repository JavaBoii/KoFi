import java.util.Random;

public class Account {
    private String username;
    private String pin;
    private String first_name;
    private String last_name;
    private double balance;
    private AccountType type;

    Account(String username, String first_name, String last_name, AccountType type) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.type = type;
        this.balance = 0;

        this.pin = generatePin();
    }

    Account(String username, String first_name, String last_name, AccountType type,  double balance) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.type = type;
        this.balance = balance;

        this.pin = generatePin();
    }

    private String generatePin() {
        return String.format("%04d", (new Random().nextInt(10000)));
    }

    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public AccountType getType() {
        return type;
    }
    public void setType(AccountType type) {
        this.type = type;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        System.out.println("account created");
        return username + "," + first_name + "," + last_name + "," + type + "," + balance + ";";
    }
}
