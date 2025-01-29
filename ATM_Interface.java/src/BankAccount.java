

// Store the account balance
// neeed to connect the users account and the ATM
public class BankAccount {
    
    private double AccountBalance;

    public double getAccountBalance() {
        // Method returns the balance of the account
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        // Sets a new amount in the account
        // add validations to prevent account amount to being set to a negative
        AccountBalance = accountBalance;
    }
}
