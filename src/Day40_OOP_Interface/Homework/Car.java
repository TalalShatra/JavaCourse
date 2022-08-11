package Day40_OOP_Interface.Homework;

public class Car implements Vehicle{

    @Override
    public void speed() {
        System.out.println("Car can speed up to 160 mph");
    }
}
