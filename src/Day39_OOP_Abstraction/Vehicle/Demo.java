package Day39_OOP_Abstraction.Vehicle;

public class Demo {

    public static void main(String[] args) {

//        Vehicle vehicle1 = new Vehicle();

        Vehicle vehicle1 = new SportsCar(2023, 400);
        vehicle1.move();
        vehicle1.fuelUp();

        System.out.println(vehicle1.getYear());
        System.out.println(vehicle1.getHorsePower());

    }
}
