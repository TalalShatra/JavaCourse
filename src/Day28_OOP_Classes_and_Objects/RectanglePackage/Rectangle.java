package Day28_OOP_Classes_and_Objects.RectanglePackage;
   // 1- create class Rectangle with attributes: length and width
   // 2- create method in class Rectangle that calculate perimeter and returns the result
   // 3- create method in class Rectangle that calculates area returns the result
   // 4- create class MAIN and create objects of Rectangle and print perimeters and area

public class Rectangle {
    int length;
    int width;

    int perimeter (){
        return (length + width) * 2;}

    int area (){
        return length * width;}



}
