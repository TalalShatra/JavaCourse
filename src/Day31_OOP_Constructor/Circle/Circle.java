package Day31_OOP_Constructor.Circle;
/*
Part 1
    - Create a class called Day31.Circle, with one attribute called radius
    - Create a no args constructor that initializes the radius to 10

Part 2
    - Overload constructor that can accept 1 parameter and initializes the radius
 */
public class Circle {

    //1 No-Args
    int radius;


    // No-Args constructor
    public Circle(){
        radius = 10;
    }


    //Parametrized Constructor
    public Circle(int radius){
        this.radius = radius;
    }

}
