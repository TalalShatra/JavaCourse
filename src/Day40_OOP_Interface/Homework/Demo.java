package Day40_OOP_Interface.Homework;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed();

        Train train = new Train();
        train.speed();

        Boat boat = new Boat();
        boat.sail();
        boat.speed();

        Plane plane = new Plane();
        plane.fly();
        plane.speed();

        SpaceShip spaceShip = new SpaceShip();
        spaceShip.fly();
        spaceShip.sail();
        spaceShip.speed();
    }
}
