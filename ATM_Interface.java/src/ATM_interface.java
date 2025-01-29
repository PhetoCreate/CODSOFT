
// Include options for(own methods):
// 1. Withdrawing(amount)
// 2. Depositing(amount)
// 3. Checking the balance
// Validate user imput (withdrawl limits and such)
//import BankAccount;

public class ATM_interface {
    
    // Get Bank Account balance, from the BankAccount class
    BankAccount account = new BankAccount();
    /// CLass variables
    double balance = account.getAccountBalance();

    public double Withdrawl(double amount){
        // restrict withdrawing if it goes to a negative
        double newBalance = balance - amount;
        account.setAccountBalance(newBalance);
        return amount;
    }

    public void Deposit(double amount){
        double NewBalance = balance + amount;
        account.setAccountBalance(NewBalance);
    }

    public double CheckBalance(){
        return balance;
    }
}
