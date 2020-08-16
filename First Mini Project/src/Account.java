public abstract class Account {

    protected double balance = 0;
    protected String accName = "";

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
    };

    /**
     * Deposits money to account
     * REQUIRES: deposited amount must be greater than 0
     * MODIFIES: this
     * EFFECT: returns new balance
     */
    public abstract void deposit();

    /**
     * Deposits money to account
     * REQUIRES: deposited amount must be greater than 0
     * MODIFIES: this
     * EFFECT: returns new balance
     */
    public abstract void withdraw();

    /**
     * Payments for goods and services
     * REQUIRES: payment has to be $0 or greater
     * MODIFIES: this
     * EFFECT: balance decreased by payment amount
     */
    public abstract void payment();

    /**
     * Refund for an amount
     * REQUIRES:
     * MODIFIES:
     * EFFECT:
     */
    public abstract void refund();


}
