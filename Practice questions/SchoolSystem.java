// ============================================================
// QUESTION 5: SCHOOL SYSTEM
// ============================================================

// Base class Staff - represents any staff member in the school
class Staff {
    // Private attributes (ENCAPSULATION)
    private String staffId;      // Unique staff identifier
    private String name;         // Name of the staff member
    private String department;   // Department where staff works
    
    // Setter methods - to set values for private attributes
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getStaffId() {
        return staffId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    // Method to display staff information
    public void displayInfo() {
        System.out.println("=== Staff Information ===");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass Teacher - inherits from Staff (INHERITANCE)
// A teacher IS-A staff member with additional properties
class Teacher extends Staff {
    // Additional attribute specific to teachers
    private String subject;      // Subject the teacher teaches
    
    // Setter and getter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }
    
    // METHOD OVERRIDING - redefining displayInfo for teachers
    @Override
    public void displayInfo() {
        System.out.println("=== Teacher Information ===");
        System.out.println("Staff ID: " + getStaffId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Subject: " + subject);
    }
}

// Main class to test the school system
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a general Staff object (e.g., admin staff)
        Staff staff = new Staff();
        staff.setStaffId("STF001");
        staff.setName("Grace Namukasa");
        staff.setDepartment("Administration");
        
        // Display staff information
        staff.displayInfo();
        System.out.println();  // Empty line for spacing
        
        // Creating a Teacher object
        Teacher teacher1 = new Teacher();
        teacher1.setStaffId("TCH001");
        teacher1.setName("Peter Okello");
        teacher1.setDepartment("Science");
        teacher1.setSubject("Physics");
        
        // Display teacher information - uses overridden method
        teacher1.displayInfo();
        System.out.println();
        
        // Creating another Teacher to demonstrate multiple objects
        Teacher teacher2 = new Teacher();
        teacher2.setStaffId("TCH002");
        teacher2.setName("Mary Nalumansi");
        teacher2.setDepartment("Arts");
        teacher2.setSubject("Literature");
        
        teacher2.displayInfo();
        
        // Demonstrating INHERITANCE and ENCAPSULATION
        System.out.println("\n=== Demonstration ===");
        System.out.println("INHERITANCE: Teacher class inherits from Staff class");
        System.out.println("ENCAPSULATION: All attributes are private, accessed via getters/setters");
        
        // Show that Teacher has access to Staff methods
        System.out.println("\nTeacher can use Staff methods:");
        System.out.println("Department: " + teacher1.getDepartment());  // Inherited method
        System.out.println("Subject: " + teacher1.getSubject());        // Own method
    }
}