class Vehicle {
    public void drive() {
        System.out.println("Repairing a car");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("No repairing");
        super.drive();
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}