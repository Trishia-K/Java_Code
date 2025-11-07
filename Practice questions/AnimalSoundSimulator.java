// ============================================================
// QUESTION 7: ANIMAL SOUND SIMULATOR
// ============================================================

// Base class Animal - represents any animal
class Animal {
    // Private attribute (ENCAPSULATION)
    private String name;    // Name of the animal
    
    // Setter and getter for name
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Method to make sound - this will be overridden by subclasses
    public void sound() {
        System.out.println(name + " makes a generic animal sound");
    }
}

// Subclass Dog - inherits from Animal (INHERITANCE)
class Dog extends Animal {
    // METHOD OVERRIDING - defining specific sound for Dog
    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof! Woof! 🐕");
    }
}

// Subclass Cat - inherits from Animal (INHERITANCE)
class Cat extends Animal {
    // METHOD OVERRIDING - defining specific sound for Cat
    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow! Meow! 🐈");
    }
}

// Subclass Cow - inherits from Animal (INHERITANCE)
class Cow extends Animal {
    // METHOD OVERRIDING - defining specific sound for Cow
    @Override
    public void sound() {
        System.out.println(getName() + " says: Moo! Moo! 🐄");
    }
}

// Main class to test the animal sound simulator
public class AnimalSoundSimulator {
    public static void main(String[] args) {
        System.out.println("=== Animal Sound Simulator ===\n");
        
        // Creating individual animal objects
        Dog dog = new Dog();
        dog.setName("Buddy");
        
        Cat cat = new Cat();
        cat.setName("Whiskers");
        
        Cow cow = new Cow();
        cow.setName("Bessie");
        
        // Testing individual sounds
        System.out.println("--- Individual Animal Sounds ---");
        dog.sound();
        cat.sound();
        cow.sound();
        
        System.out.println("\n--- Demonstrating POLYMORPHISM ---");
        // POLYMORPHISM: Creating an array of Animal references
        // Each reference can hold objects of different subclasses
        Animal[] animals = new Animal[5];
        
        // Filling the array with different animal objects
        animals[0] = new Dog();
        animals[0].setName("Max");
        
        animals[1] = new Cat();
        animals[1].setName("Felix");
        
        animals[2] = new Cow();
        animals[2].setName("Daisy");
        
        animals[3] = new Dog();
        animals[3].setName("Rocky");
        
        animals[4] = new Cat();
        animals[4].setName("Mittens");
        
        // Loop through the array and call sound() on each animal
        // POLYMORPHISM in action: The correct sound() method is called
        // based on the actual object type, not the reference type
        System.out.println("All animals making sounds:");
        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();  // Each animal makes its own sound!
        }
        
        // Alternative loop using enhanced for loop (easier to read)
        System.out.println("\n--- Using Enhanced For Loop ---");
        for (Animal animal : animals) {
            animal.sound();
        }
        
        // Explanation of what happened
        System.out.println("\n=== Key Concepts Demonstrated ===");
        System.out.println("1. ENCAPSULATION: Animal attributes are private");
        System.out.println("2. INHERITANCE: Dog, Cat, Cow inherit from Animal");
        System.out.println("3. OVERRIDING: Each subclass overrides sound() method");
        System.out.println("4. POLYMORPHISM: Animal array holds different animal types");
        System.out.println("   - Same method call (sound()) produces different results");
        System.out.println("   - Behavior determined at runtime based on actual object type");
    }
}
