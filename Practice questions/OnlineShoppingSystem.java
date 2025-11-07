// ============================================================
// QUESTION 10: ONLINE SHOPPING SYSTEM
// ============================================================

// Base class Item - represents any item in the e-commerce store
class Item {
    // Private attributes (ENCAPSULATION)
    private String itemId;      // Unique item identifier
    private String name;        // Name of the item
    private double price;       // Price of the item
    
    // Setter methods - to set values for private attributes
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Getter methods - to retrieve values of private attributes
    public String getItemId() {
        return itemId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Method to display item information
    public void displayInfo() {
        System.out.println("=== Item Information ===");
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Price: UGX " + String.format("%.2f", price));
    }
}

// Subclass ElectronicItem - inherits from Item (INHERITANCE)
// Electronic items come with warranty period
class ElectronicItem extends Item {
    // Additional attribute specific to electronic items
    private int warrantyPeriod;   // Warranty period in months
    
    // Setter and getter for warranty period
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    // METHOD OVERRIDING - redefining displayInfo to include warranty
    @Override
    public void displayInfo() {
        System.out.println("=== Electronic Item Information ===");
        System.out.println("Item ID: " + getItemId());
        System.out.println("Name: " + getName());
        System.out.println("Price: UGX " + String.format("%.2f", getPrice()));
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Category: Electronics");
        
        // Additional warranty information
        if (warrantyPeriod >= 24) {
            System.out.println("✓ Extended Warranty Coverage");
        } else if (warrantyPeriod >= 12) {
            System.out.println("✓ Standard Warranty Coverage");
        } else {
            System.out.println("✓ Basic Warranty Coverage");
        }
    }
}

// Main class to test the online shopping system
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("*** WELCOME TO UGANDA ONLINE STORE ***\n");
        
        // Creating regular Item objects (non-electronic)
        System.out.println("--- GENERAL ITEMS ---\n");
        
        Item item1 = new Item();
        item1.setItemId("ITM001");
        item1.setName("Cotton T-Shirt");
        item1.setPrice(35000);
        item1.displayInfo();
        
        System.out.println();
        
        Item item2 = new Item();
        item2.setItemId("ITM002");
        item2.setName("Leather Shoes");
        item2.setPrice(120000);
        item2.displayInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Creating ElectronicItem objects
        System.out.println("--- ELECTRONIC ITEMS ---\n");
        
        ElectronicItem electronic1 = new ElectronicItem();
        electronic1.setItemId("ELEC001");
        electronic1.setName("Samsung Galaxy S24");
        electronic1.setPrice(3500000);
        electronic1.setWarrantyPeriod(24);  // 24 months = 2 years
        electronic1.displayInfo();
        
        System.out.println();
        
        ElectronicItem electronic2 = new ElectronicItem();
        electronic2.setItemId("ELEC002");
        electronic2.setName("HP Laptop - 15.6 inch");
        electronic2.setPrice(2800000);
        electronic2.setWarrantyPeriod(12);  // 12 months = 1 year
        electronic2.displayInfo();
        
        System.out.println();
        
        ElectronicItem electronic3 = new ElectronicItem();
        electronic3.setItemId("ELEC003");
        electronic3.setName("Sony Bluetooth Headphones");
        electronic3.setPrice(450000);
        electronic3.setWarrantyPeriod(6);   // 6 months
        electronic3.displayInfo();
        
        System.out.println();
        
        ElectronicItem electronic4 = new ElectronicItem();
        electronic4.setItemId("ELEC004");
        electronic4.setName("LG Smart TV 55 inch");
        electronic4.setPrice(4500000);
        electronic4.setWarrantyPeriod(36);  // 36 months = 3 years
        electronic4.displayInfo();
        
        // Shopping cart summary
        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== SHOPPING CART SUMMARY ===");
        System.out.println("Total Regular Items: 2");
        System.out.println("Total Electronic Items: 4");
        
        // Calculate total value
        double totalValue = item1.getPrice() + item2.getPrice() + 
                          electronic1.getPrice() + electronic2.getPrice() + 
                          electronic3.getPrice() + electronic4.getPrice();
        
        System.out.println("Total Cart Value: UGX " + String.format("%.2f", totalValue));
        
        // Demonstrate OOP concepts
        System.out.println("\n=== OOP CONCEPTS DEMONSTRATED ===");
        System.out.println("1. ENCAPSULATION: All attributes are private with getters/setters");
        System.out.println("2. INHERITANCE: ElectronicItem extends Item class");
        System.out.println("3. OVERRIDING: ElectronicItem overrides displayInfo() method");
        System.out.println("4. CODE ORGANIZATION: Logical separation of item types");
    }
}
