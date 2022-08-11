package Day39_OOP_Abstraction.Vehicle;

public abstract class Vehicle {



    // abstract int year; | not possible - cannot use abstract keyword for variables

    private int year;
    private int horsePower;

    public Vehicle(int year, int horsePower) {
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    protected abstract void move();
    // Abstract methods can be OVERLOADED
    abstract void move(int miles);

    public abstract void fuelUp();
}
