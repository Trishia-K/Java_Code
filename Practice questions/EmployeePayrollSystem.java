// ============================================================
// QUESTION 2: EMPLOYEE PAYROLL SYSTEM
// ============================================================

// Base class Employee - represents a permanent employee
class Employee {
    // Private attributes - only accessible within this class (ENCAPSULATION)
    private String empId;      // Employee ID
    private String name;       // Employee name
    private double salary;     // Employee salary
    
    // Setter methods - to set values for private attributes
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getEmpId() {
        return empId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Method to calculate pay - for permanent employees, it's just the salary
    public double calculatePay() {
        return salary;
    }
    
    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: UGX " + salary);
        System.out.println("Net Pay: UGX " + calculatePay());
    }
}

// Subclass ContractEmployee - inherits from Employee (INHERITANCE)
class ContractEmployee extends Employee {
    // Additional attribute specific to contract employees
    private int contractDuration;  // Duration in months
    
    // Setter and getter for contract duration
    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }
    
    public int getContractDuration() {
        return contractDuration;
    }
    
    // METHOD OVERRIDING - redefining how pay is calculated
    // Contract employees have 10% tax deducted
    @Override
    public double calculatePay() {
        // Get the base salary from parent class
        double baseSalary = getSalary();
        // Calculate 10% tax
        double tax = baseSalary * 0.10;
        // Return salary after tax deduction
        return baseSalary - tax;
    }
    
    // Override displayInfo to include contract duration
    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: UGX " + getSalary());
        System.out.println("Contract Duration: " + contractDuration + " months");
        System.out.println("Tax (10%): UGX " + (getSalary() * 0.10));
        System.out.println("Net Pay: UGX " + calculatePay());
    }
}

// Main class to test the payroll system
public class EmployeePayrollSystem {
    public static void main(String[] args) {
        // Create a permanent employee
        System.out.println("=== Permanent Employee ===");
        Employee permEmp = new Employee();
        permEmp.setEmpId("EMP001");
        permEmp.setName("John Mukasa");
        permEmp.setSalary(5000000);  // UGX 5,000,000
        permEmp.displayInfo();
        
        System.out.println("\n=== Contract Employee ===");
        // Create a contract employee
        ContractEmployee contractEmp = new ContractEmployee();
        contractEmp.setEmpId("EMP002");
        contractEmp.setName("Sarah Nakato");
        contractEmp.setSalary(3000000);  // UGX 3,000,000
        contractEmp.setContractDuration(12);  // 12-month contract
        contractEmp.displayInfo();
        
        // Demonstrate the difference in pay calculation
        System.out.println("\n=== Pay Calculation Summary ===");
        System.out.println("Permanent Employee Net Pay: UGX " + permEmp.calculatePay());
        System.out.println("Contract Employee Net Pay: UGX " + contractEmp.calculatePay());
    }
}