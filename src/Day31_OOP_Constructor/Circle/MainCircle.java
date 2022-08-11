package Day31_OOP_Constructor.Circle;

public class MainCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.radius);

        Circle circle1 = new Circle(20);
        System.out.println(circle1.radius);
    }
}
