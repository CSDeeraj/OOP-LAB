class Vehicle {
    void fueltype() {
        System.out.println("Vehicles use different types of fuel");
    }
}

class Car extends Vehicle {
    void fueltype() {
        System.out.println("Cars need petrol or diesel to run");
    }
}

class Electriccar extends Car {
    void fueltype() {
        System.out.println("Electric cars use batteries instead of fuel.");
    }
}

public class fueloverride {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.fueltype();
        Car c = new Car();
        c.fueltype();
        Electriccar e = new Electriccar();
        e.fueltype();
    }
}
