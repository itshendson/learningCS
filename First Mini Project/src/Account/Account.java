package Account;

public abstract class Account {

    protected double balance;
    protected String accName;
    protected int maxNumOfDepositsPerMonth;

    /**
     * Constructor for account
     */
    public Account(String accName, double balance) {
        this.accName = accName;
        this.balance = balance;
    }

    /**
     * Tells the customer how much money they have
     *     MODIFIES: this
     *     EFFECT: returns balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits money to account
     * REQUIRES: amount must be greater than 0
     * MODIFIES: this
     * EFFECT: returns new balance
     */
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    /**
     * Deposits money to account
     * REQUIRES: deposited amount must be greater than 0. balance can not go below 0.
     * MODIFIES: this
     * EFFECT: balance decrease by amount
     */
    public double withdraw(double amount) {
        balance -= amount;
        maxNumOfDepositsPerMonth -= 1;
        return balance;
    }

    /*
     * Payments for goods and services
     * REQUIRES: payment has to be $0 or greater
     * MODIFIES: this
     * EFFECT: balance decreased by payment amount
     */
    //public abstract void payment();

    /*
     * Refund for an amount
     * REQUIRES:
     * MODIFIES:
     * EFFECT:
     */
    //public abstract void refund();

    /*
     * Earned interest on balance as of date
     * REQUIRES:
     * MODIFIES:
     * EFFECT:
     */
    //public abstract void interest();

    /*
     * Minimum balance to not incur fee
     * REQUIRES:
     * MODIFIES:
     * EFFECT:
     */
    //public abstract void minBal();


}
