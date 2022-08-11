package Day36_OOP_Inheritance.CyclePackage;

public class RaceBike extends Bicycle {
    int wheelSize;

    public RaceBike(int gear, int wheelSize) {
        super(gear);
        this.wheelSize = wheelSize;
    }
}
