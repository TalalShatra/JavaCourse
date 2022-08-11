package Day35_OOP_Inheritance;

public class Bird extends Animal {

    String color;
    double sizeOfWings;

    public Bird (String name, int age, String color, double sizeOfWings) {
        super(name, age);
        this.color = color;
        this.sizeOfWings = sizeOfWings;
    }

    public void sing() {
        System.out.println("Bird is singing");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

}
