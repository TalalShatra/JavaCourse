package Day40_OOP_Interface.CarPackage;

public class Mercedes extends Car implements Diesel {

    int age;

    public Mercedes(String model, int year) {

        super(model, year);
    }

    @Override
    public void fuelUp() {
        System.out.println("Fuel up every 300 miles!");
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 5000 miles!");
    }
}
