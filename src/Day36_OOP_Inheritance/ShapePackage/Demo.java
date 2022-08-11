package Day36_OOP_Inheritance.ShapePackage;

public class Demo {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle.radius);
        System.out.println(circle.area);
        System.out.println(circle.perimeter);

        Rectangle rectangle = new Rectangle(10, 9);
        System.out.println(rectangle.area);
        System.out.println(rectangle.perimeter);

        Square square = new Square (7);
        System.out.println(square.length); // 7
        System.out.println(square.width);  // 7
        System.out.println(square.area);
        System.out.println(square.perimeter);


    }
}
