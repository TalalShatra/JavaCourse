package Day32_OOP_AceesModifier._02_InstanceModifiers.DefaultModifier;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck("F150");

        System.out.println(truck.truckName);

        truck.printTruckName();


    }

}
