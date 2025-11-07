// ============================================================
// QUESTION 4: BANKING SYSTEM
// ============================================================

// Base class Account - represents a basic bank account
class Account {
    // Private attributes (ENCAPSULATION)
    private String accountNumber;  // Unique account number
    private double balance;        // Current balance in the account
    
    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {  // Check if amount is valid
            balance += amount;  // Add amount to balance
            System.out.println("Deposited: UGX " + amount);
            System.out.println("New Balance: UGX " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Check if amount is valid and available
            balance -= amount;  // Subtract amount from balance
            System.out.println("Withdrawn: UGX " + amount);
            System.out.println("New Balance: UGX " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }
    
    // Method to display account information
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: UGX " + balance);
    }
}

// Subclass SavingsAccount - inherits from Account (INHERITANCE)
class SavingsAccount extends Account {
    // Additional attribute specific to savings accounts
    private double interestRate;   // Annual interest rate (e.g., 5.5 for 5.5%)
    private static final double MINIMUM_BALANCE = 1000;  // Minimum balance required
    
    // Setter and getter for interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    // METHOD OVERRIDING - redefining withdraw to enforce minimum balance
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal would drop balance below minimum
        if (amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE) {
            // Update balance using setter
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: UGX " + amount);
            System.out.println("New Balance: UGX " + getBalance());
        } else if (amount > 0 && (getBalance() - amount) < MINIMUM_BALANCE) {
            // If withdrawal would go below minimum balance
            System.out.println("Withdrawal denied! Minimum balance of UGX " + 
                             MINIMUM_BALANCE + " must be maintained.");
            System.out.println("Current Balance: UGX " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    // Method to calculate and add interest to the account
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest added: UGX " + interest);
        System.out.println("New Balance: UGX " + getBalance());
    }
    
    // Override displayInfo to include interest rate
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent's displayInfo
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance Required: UGX " + MINIMUM_BALANCE);
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Test regular Account
        System.out.println("=== Regular Account ===");
        Account account = new Account();
        account.setAccountNumber("ACC001");
        account.setBalance(5000);
        account.displayInfo();
        System.out.println();
        
        account.deposit(2000);
        System.out.println();    
        account.withdraw(3000);
        System.out.println("\n");
        
        // Test SavingsAccount with minimum balance restriction
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SAV001");
        savings.setBalance(10000);
        savings.setInterestRate(5.5);
        savings.displayInfo();
        System.out.println();
        
        // Try to withdraw an amount that would leave balance above minimum
        savings.withdraw(3000);  // This should succeed (10000 - 3000 = 7000 > 1000)
        System.out.println();
        
        // Try to withdraw an amount that would leave balance below minimum
        savings.withdraw(7000);  // This should fail (7000 - 7000 = 0 < 1000)
        System.out.println();
        
        // Add interest to the account
        savings.addInterest();
        System.out.println();
        
        // Final account information
        System.out.println("=== Final Account Status ===");
        savings.displayInfo();
    }
}