// ============================================================
// QUESTION 6: PRODUCT INVENTORY SYSTEM
// ============================================================

// Base class Product - represents any product in the store
class Product {
    // Private attributes (ENCAPSULATION)
    private String productId;    // Unique product identifier
    private String name;         // Name of the product
    private double price;        // Price of the product
    
    // Setter methods - to set values for private attributes
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Method to display product information
    public void displayInfo() {
        System.out.println("=== Product Information ===");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: UGX " + price);
    }
}

// Subclass PerishableProduct - inherits from Product (INHERITANCE)
// Perishable products have an expiry date
class PerishableProduct extends Product {
    // Additional attribute specific to perishable products
    private String expiryDate;   // Date when product expires
    
    // Setter and getter for expiry date
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
    
    // METHOD OVERRIDING - redefining displayInfo to include expiry date
    @Override
    public void displayInfo() {
        System.out.println("=== Perishable Product Information ===");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: UGX " + getPrice());
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("*** WARNING: This product has an expiry date! ***");
    }
}

// Main class to test the product inventory system
public class ProductInventorySystem {
    public static void main(String[] args) {
        // Creating regular (non-perishable) Product objects
        System.out.println("=== NON-PERISHABLE PRODUCTS ===\n");
        
        Product product1 = new Product();
        product1.setProductId("P001");
        product1.setName("Laptop");
        product1.setPrice(2500000);
        product1.displayInfo();
        
        System.out.println();
        
        Product product2 = new Product();
        product2.setProductId("P002");
        product2.setName("Office Chair");
        product2.setPrice(350000);
        product2.displayInfo();
        
        System.out.println("\n=== PERISHABLE PRODUCTS ===\n");
        
        // Creating PerishableProduct objects
        PerishableProduct perishable1 = new PerishableProduct();
        perishable1.setProductId("PP001");
        perishable1.setName("Fresh Milk");
        perishable1.setPrice(5000);
        perishable1.setExpiryDate("15-Nov-2025");
        perishable1.displayInfo();
        
        System.out.println();
        
        PerishableProduct perishable2 = new PerishableProduct();
        perishable2.setProductId("PP002");
        perishable2.setName("Bread");
        perishable2.setPrice(3500);
        perishable2.setExpiryDate("08-Nov-2025");
        perishable2.displayInfo();
        
        System.out.println();
        
        PerishableProduct perishable3 = new PerishableProduct();
        perishable3.setProductId("PP003");
        perishable3.setName("Yogurt");
        perishable3.setPrice(4000);
        perishable3.setExpiryDate("20-Nov-2025");
        perishable3.displayInfo();
        
        // Summary
        System.out.println("\n=== INVENTORY SUMMARY ===");
        System.out.println("Total Regular Products: 2");
        System.out.println("Total Perishable Products: 3");
        System.out.println("Total Products in Inventory: 5");
    }
}
