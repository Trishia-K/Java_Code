// ============================================================
// QUESTION 3: LIBRARY MANAGEMENT
// ============================================================

// Base class Book - represents a book in the library
class Book {
    // Private attributes (ENCAPSULATION)
    private String title;      // Title of the book
    private String author;     // Author of the book
    private double price;      // Price of the book
    
    // Setter methods - to set values
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Getter methods - to retrieve values
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Method to display book details
    public void displayDetails() {
        System.out.println("=== Book Details ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: UGX " + price);
    }
}

// Subclass Magazine - inherits from Book (INHERITANCE)
// A magazine IS-A type of book/publication
class Magazine extends Book {
    // Additional attribute specific to magazines
    private int issueNumber;   // Issue number (e.g., January 2025 = issue 1)
    
    // Setter and getter for issue number
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    
    public int getIssueNumber() {
        return issueNumber;
    }
    
    // METHOD OVERRIDING - redefining the display method for magazines
    @Override
    public void displayDetails() {
        System.out.println("=== Magazine Details ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Author/Publisher: " + getAuthor());
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Price: UGX " + getPrice());
    }
}

// Main class to test the library management system
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book();
        book.setTitle("Things Fall Apart");
        book.setAuthor("Chinua Achebe");
        book.setPrice(25000);
        
        // Display book information
        book.displayDetails();
        System.out.println();  // Empty line for spacing
        
        // Creating a Magazine object
        Magazine magazine = new Magazine();
        magazine.setTitle("National Geographic");
        magazine.setAuthor("National Geographic Society");
        magazine.setIssueNumber(145);
        magazine.setPrice(15000);
        
        // Display magazine information - uses overridden method
        magazine.displayDetails();
        
        // Creating another book to demonstrate multiple objects
        System.out.println();
        Book book2 = new Book();
        book2.setTitle("A Brief History of Time");
        book2.setAuthor("Stephen Hawking");
        book2.setPrice(35000);
        book2.displayDetails();
    }
}