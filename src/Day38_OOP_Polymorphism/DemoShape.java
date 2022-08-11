package Day38_OOP_Polymorphism;

public class DemoShape {
    public static void main(String[] args) {

        // Reference types can store its own and sub-types
        Square square1 = new Square();       // every square is a square
        Rectangle square2 = new Square();    // every square is a rectangle
        Shape square3 = new Square();        // every square is a shape
        Object square4 = new Square();       // every square is an object

        /*
        Inheritance lets us inherit attributes and methods from another class.
        Polymorphism uses those methods to perform different tasks.
        This allows us to perform a single action in different ways.
         (www.3schools.com)
         */

        // Square shape = new Shape();  every shape is not a square

        square1.getShapeName();   // method from Shape class (Grand-Parent)
        square1.printArea();      // method from Rectangle class (Parent)
        square1.printPerimeter(); // method from Square class


        square3.getShapeName();
        // square3.printArea();        - cannot access child methods
        // square3.printPerimeter();   - cannot access methods from child class


    }
}
