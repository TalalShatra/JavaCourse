package Day32_OOP_AceesModifier._02_InstanceModifiers.PublicModifier;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes");

        System.out.println(car.carName);

        car.printCarName();

    }

}
