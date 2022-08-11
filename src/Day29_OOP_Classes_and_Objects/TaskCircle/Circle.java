package Day29_OOP_Classes_and_Objects.TaskCircle;

public class Circle {
   // 1- Create a class called Day31.Circle with following fields
     //       radius
      //      PI = 3.14 by default


   // 2- Create 2 methods in circle class which returns the results
        //    calculate area (π * r * r)
   // calculate perimeter (2 * π * r)


    double radius;
    final double PI = 3.14; // with final keyWord we cannot update this value
                            // and we call it Constant, and we name it with upperCase
    double area(){
        return (PI * Math.pow(radius, 2)) ;}
    double perimeter(){
        return (2 * PI * radius) ;}

    }

