public class VehicleManagementSystem {

    static class Vehicle {
        private String RegNumber;
        private String model;
        private double speed;

        // Constructors
        public Vehicle(String RegNumber, String model, double speed) {
            this.RegNumber = RegNumber;
            this.model = model;
            this.speed = speed;
        }

        // setters (Names standardized)
        public void setRegNumber(String RegNumber) {
            this.RegNumber = RegNumber;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public void setSpeed(double speed) {
            this.speed = speed;
        }

        // getters (FIXED: Added return types and removed parameters)
        public String getRegNumber() {
            return this.RegNumber;
        }
        public String getModel() {
            return this.model;
        }
        public double getSpeed() {
            return this.speed;
        }

        // Creating displayInfo() method
        public void displayInfo() {
            System.out.println("Regnumber: " + RegNumber);
            System.out.println("Model: " + model);
            System.out.println("Speed: " + speed);
        }
    }

    static class Truck extends Vehicle {
        private double loadCapacity;

        public Truck(String RegNumber, String model, double speed, double loadCapacity) {
            super(RegNumber, model, speed);
            this.loadCapacity = loadCapacity;
        }

        public void setLoadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        // getter (FIXED: Added return type and removed parameter)
        public double getLoadCapacity() {
            return this.loadCapacity;
        }

        @Override
        public void displayInfo() {
            // Using the corrected getter names
            System.out.println("Regnumber: " + getRegNumber());
            System.out.println("Model: " + getModel());
            System.out.println("Speed: " + getSpeed());
            System.out.println("LoadCapacity: " + loadCapacity);
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("UBM123X", "Toyota", 100.0);
        car.displayInfo();
        System.out.println("---");

        Truck truck = new Truck("UBY677F", "Carter", 90.0, 20.0);
        truck.displayInfo();

    }
}