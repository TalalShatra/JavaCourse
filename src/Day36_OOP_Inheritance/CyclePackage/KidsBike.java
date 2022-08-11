package Day36_OOP_Inheritance.CyclePackage;

public class KidsBike extends Bicycle {
    int numberOfWheels;

    public KidsBike(int gear, int numberOfWheels) {
        super(gear);
        this.numberOfWheels = numberOfWheels;
    }
}
