package Day40_OOP_Interface.CarPackage;

public class Tesla extends Car implements Electric {

    public Tesla(String model, int year) {
        super(model, year);
    }

    @Override
    public void charge() {
        System.out.println("Charge from supercharger every 500 miles");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change Battery every 100000 miles!");
    }
}
