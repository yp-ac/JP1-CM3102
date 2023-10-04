/*
 * Title: Program Implementing Multi-Level Inheritance
 * Assignment No: 09 (c)
 *
 * Enrollment No: 2106206      Date: 7th Sept 2023
 * */

class Vehicle {
    protected final String brand;
    protected final String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    protected final int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class SportsCar extends Car {
    private final int topSpeed;

    public SportsCar(String brand, String model, int numDoors, int topSpeed) {
        super(brand, model, numDoors);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}

public class Practical9c {
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar("Ferrari", "458 Italia", 2, 200);

        System.out.println("Brand: " + mySportsCar.getBrand());
        System.out.println("Model: " + mySportsCar.getModel());
        System.out.println("Number of Doors: " + mySportsCar.getNumDoors());
        System.out.println("Top Speed: " + mySportsCar.getTopSpeed() + " mph");
    }
}
