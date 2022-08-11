package Day42_Exception.Homework.H1;
//create demo application that helps you to buy a car & drive it:
public class Demo {
    public static void main(String[] args) {

        Car car = new Car();
        try {
            car.buy(CarCondition.WASTE);
        } catch (Exception ex) {
            System.out.println("don't buy this car");
        }

        car.drive("Rainy");

    }
}
