package Day40_OOP_Interface.Homework;

public class Boat implements Vehicle, Sailing{

    @Override
    public void sail() {
        System.out.println("Boat is sailing!");
    }

    @Override
    public void speed() {
        System.out.println("Boat can speed up to 50 mph");
    }
}
