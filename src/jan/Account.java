package jan;

class Account {
    private String iban;
    private AccountType type;
    private double balance;

    public Account(String iban, AccountType type, double balance) {
        this.iban = iban;
        this.type = type;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}