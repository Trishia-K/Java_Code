// ============================================================
// QUESTION 8: UNIVERSITY SYSTEM
// ============================================================

// Base class Person - represents any person in the university
class Person {
    // Private attributes (ENCAPSULATION)
    private String name;    // Name of the person
    private int age;        // Age of the person
    
    // Setter methods - to set values for private attributes
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student - inherits from Person (INHERITANCE)
// A student IS-A person with additional properties
class Student extends Person {
    // Additional attribute specific to students
    private String regNo;    // Registration number
    
    // Setter and getter for registration number
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    
    public String getRegNo() {
        return regNo;
    }
    
    // METHOD OVERRIDING - redefining displayInfo for students
    @Override
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Registration Number: " + regNo);
        System.out.println("Status: Enrolled Student");
    }
}

// Subclass Lecturer - inherits from Person (INHERITANCE)
// A lecturer IS-A person with additional properties
class Lecturer extends Person {
    // Additional attribute specific to lecturers
    private double salary;   // Monthly salary
    
    // Setter and getter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // METHOD OVERRIDING - redefining displayInfo for lecturers
    @Override
    public void displayInfo() {
        System.out.println("=== Lecturer Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: UGX " + salary);
        System.out.println("Status: Faculty Member");
    }
}

// Main class to test the university system
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a general Person object
        System.out.println("--- General Person ---");
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.displayInfo();
        
        System.out.println();
        
        // Creating Student objects
        System.out.println("--- Students ---");
        Student student1 = new Student();
        student1.setName("Alice Namubiru");
        student1.setAge(21);
        student1.setRegNo("2023/BSE/001");
        student1.displayInfo();
        
        System.out.println();
        
        Student student2 = new Student();
        student2.setName("David Okello");
        student2.setAge(22);
        student2.setRegNo("2023/BSE/002");
        student2.displayInfo();
        
        System.out.println();
        
        // Creating Lecturer objects
        System.out.println("--- Lecturers ---");
        Lecturer lecturer1 = new Lecturer();
        lecturer1.setName("Dr. Sarah Nakato");
        lecturer1.setAge(45);
        lecturer1.setSalary(8000000);
        lecturer1.displayInfo();
        
        System.out.println();
        
        Lecturer lecturer2 = new Lecturer();
        lecturer2.setName("Prof. Michael Wasswa");
        lecturer2.setAge(52);
        lecturer2.setSalary(12000000);
        lecturer2.displayInfo();
        
        // Summary and demonstration
        System.out.println("\n=== University Statistics ===");
        System.out.println("Total Students Created: 2");
        System.out.println("Total Lecturers Created: 2");
        System.out.println("Total Persons in System: 5");
        
        System.out.println("\n=== OOP Concepts Demonstrated ===");
        System.out.println("1. ENCAPSULATION: All attributes are private");
        System.out.println("2. INHERITANCE: Student and Lecturer inherit from Person");
        System.out.println("3. OVERRIDING: Both subclasses override displayInfo()");
        System.out.println("4. Each class adds its own specific attributes");
    }
}
