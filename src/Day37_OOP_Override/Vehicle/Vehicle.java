package Day37_OOP_Override.Vehicle;

public class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void speedUpTo60() {}

    public void breakDownTo0() {}
}
