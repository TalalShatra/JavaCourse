package Day40_OOP_Interface.Homework;

public class Train implements Vehicle{

    @Override
    public void speed() {
        System.out.println("Train can speed up to 100 mph");
    }
}
