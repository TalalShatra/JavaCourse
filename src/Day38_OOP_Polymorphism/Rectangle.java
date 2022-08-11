package Day38_OOP_Polymorphism;

public class Rectangle extends Shape{

    @Override
    String getShapeName() {
        return ("Rectangle");
    }

    @Override
    void printShapeName() {
        System.out.println("Rectangle");;
    }
    void printArea() {
        System.out.println("20");
    }
}
