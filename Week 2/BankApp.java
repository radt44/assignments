public class BankApp {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("Alice", 500.0);
        BankAccount account2 = new BankAccount("Bob", 300.0);

        // Perform some transactions
        account1.deposit(200.0);
        account1.withdraw(100.0);
        account2.withdraw(400.0);
        account2.deposit(150.0);

        // Display account info
        System.out.println("\n--- Account Information ---");
        account1.displayInfo();
        System.out.println();
        account2.displayInfo();
    }
}