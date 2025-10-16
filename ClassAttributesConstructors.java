public class ClassAttributesConstructors {
        public static void main(String[] args) {
            class Car{
                private String brand;
                private String model;
                private String color;

                Car(String brand, String model, String color) {
                    this.brand = brand;
                    this.model = model;
                    this.color = color;
                }
                void drive() {
                    System.out.println("The car is a " + brand + " " + model + " " + color);
                }
            }
            Car newCar=new Car("Toyota", "new", "red"); //An object is an instance of a class.
            newCar.drive();
        }
}