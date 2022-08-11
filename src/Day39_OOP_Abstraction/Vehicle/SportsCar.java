package Day39_OOP_Abstraction.Vehicle;

public class SportsCar extends Vehicle {

    public SportsCar(int year, int horsePower) {
        super(year, horsePower);
    }

    @Override
    public void move() {
        System.out.println("Sports car is moving fast");
    }

    @Override
    public void move(int miles) {
        System.out.println("Sports car is moving " + miles + " miles!");
    }

    @Override
    public void fuelUp() {
        System.out.println("Sports car fueling up with 93 octane gas!");
    }

}