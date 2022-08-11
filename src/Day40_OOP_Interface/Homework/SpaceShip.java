package Day40_OOP_Interface.Homework;

public class SpaceShip implements Vehicle, Flying, Sailing{

    @Override
    public void fly() {
        System.out.println("SpaceShip can fly to stars!");
    }

    @Override
    public void sail() {
        System.out.println("SpaceShip is sailing!");
    }

    @Override
    public void speed() {
        System.out.println("SpaceShip speed up to 1000 mph");
    }
}
