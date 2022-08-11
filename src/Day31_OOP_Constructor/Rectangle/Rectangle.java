package Day31_OOP_Constructor.Rectangle;
/*
-Create a class called Rectangle, with 2 attributes width and length;
    -Create a constructor with 2 parameters, width and length
    -Create a method to calculate the area of Rectangle
 */
public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area(){
    return length * width;
        }
    }
