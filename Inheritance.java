
    class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal { // Dog is a subclass of Animal
    @Override
    void eat() {
        System.out.println("The dog chews bones.");
    }
    void bark() {
        System.out.println("The dog barks twice.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog
    }
}
    
