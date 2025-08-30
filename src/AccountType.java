public enum AccountType {
    DEBIT(12.99, 0),
    CREDIT(9.99, 6000),
    STUDENT(0.0, 500);

    final double fees;
    final double max_credit;

    AccountType(double fees, double max_credit){
        this.fees = fees;
        this.max_credit = max_credit;
    }
}
