// ============================================================
// QUESTION 9: BANK LOAN PROCESSING
// ============================================================

// Base class Loan - represents a general loan
class Loan {
    // Private attributes (ENCAPSULATION)
    private String loanId;          // Unique loan identifier
    private double amount;          // Loan amount borrowed
    private double interestRate;    // Annual interest rate (e.g., 12.5 for 12.5%)
    
    // Setter methods - to set values for private attributes
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getLoanId() {
        return loanId;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    // Method to calculate total repayment (principal + interest)
    // Assuming 1-year loan period for simplicity
    public double calculateTotalRepayment() {
        double interest = amount * (interestRate / 100);
        return amount + interest;
    }
    
    // Method to display loan information
    public void displayInfo() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Loan Amount: UGX " + amount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Repayment: UGX " + calculateTotalRepayment());
    }
}

// Subclass HomeLoan - inherits from Loan (INHERITANCE)
// Home loans have special considerations based on property value
class HomeLoan extends Loan {
    // Additional attribute specific to home loans
    private double propertyValue;    // Value of the property being purchased
    
    // Setter and getter for property value
    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }
    
    public double getPropertyValue() {
        return propertyValue;
    }
    
    // METHOD OVERRIDING - redefining calculation for home loans
    // Home loans typically have longer terms and different interest calculations
    // Assuming 20-year term for home loans
    @Override
    public double calculateTotalRepayment() {
        int years = 20;  // Home loan term in years
        double principal = getAmount();
        double rate = getInterestRate() / 100;
        
        // Simple interest calculation for demonstration
        // In real banking: Total = Principal + (Principal × Rate × Time)
        double totalInterest = principal * rate * years;
        double totalRepayment = principal + totalInterest;
        
        return totalRepayment;
    }
    
    // Method to check loan-to-value ratio (LTV)
    // LTV = (Loan Amount / Property Value) × 100
    public double calculateLTV() {
        return (getAmount() / propertyValue) * 100;
    }
    
    // Override displayInfo to include property details
    @Override
    public void displayInfo() {
        System.out.println("=== Home Loan Information ===");
        System.out.println("Loan ID: " + getLoanId());
        System.out.println("Property Value: UGX " + propertyValue);
        System.out.println("Loan Amount: UGX " + getAmount());
        System.out.println("Interest Rate: " + getInterestRate() + "% per year");
        System.out.println("Loan Term: 20 years");
        System.out.println("Loan-to-Value Ratio: " + String.format("%.2f", calculateLTV()) + "%");
        System.out.println("Total Repayment (Principal + Interest): UGX " + 
                         String.format("%.2f", calculateTotalRepayment()));
        System.out.println("Monthly Payment: UGX " + 
                         String.format("%.2f", calculateTotalRepayment() / (20 * 12)));
    }
}

// Main class to test the loan processing system
public class BankLoanProcessing {
    public static void main(String[] args) {
        // Test general Loan
        System.out.println("=== General Loan (1-year term) ===");
        Loan generalLoan = new Loan();
        generalLoan.setLoanId("LOAN001");
        generalLoan.setAmount(5000000);     // UGX 5 million
        generalLoan.setInterestRate(15.0);  // 15% annual interest
        generalLoan.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test HomeLoan
        HomeLoan homeLoan1 = new HomeLoan();
        homeLoan1.setLoanId("HOME001");
        homeLoan1.setPropertyValue(200000000);  // UGX 200 million property
        homeLoan1.setAmount(150000000);         // UGX 150 million loan
        homeLoan1.setInterestRate(12.5);        // 12.5% annual interest
        homeLoan1.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test another HomeLoan with different values
        HomeLoan homeLoan2 = new HomeLoan();
        homeLoan2.setLoanId("HOME002");
        homeLoan2.setPropertyValue(80000000);   // UGX 80 million property
        homeLoan2.setAmount(60000000);          // UGX 60 million loan
        homeLoan2.setInterestRate(13.0);        // 13% annual interest
        homeLoan2.displayInfo();
        
        // Comparison
        System.out.println("\n=== Loan Comparison ===");
        System.out.println("General Loan Repayment: UGX " + 
                         String.format("%.2f", generalLoan.calculateTotalRepayment()));
        System.out.println("Home Loan 1 Repayment: UGX " + 
                         String.format("%.2f", homeLoan1.calculateTotalRepayment()));
        System.out.println("Home Loan 2 Repayment: UGX " + 
                         String.format("%.2f", homeLoan2.calculateTotalRepayment()));
        
        System.out.println("\nNote: General loans have 1-year term, Home loans have 20-year term");
    }
}
