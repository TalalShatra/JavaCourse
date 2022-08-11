package Day40_OOP_Interface.Homework;

public class Plane implements Vehicle, Flying{

    @Override
    public void fly() {
        System.out.println("Plane is flying!");
    }

    @Override
    public void speed() {
        System.out.println("Plane can speed up 500 mph");

    }
}
