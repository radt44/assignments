public class BankAccount {
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for " + owner);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println(owner + " withdrew $" + amount);
        }
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Display account info
    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}