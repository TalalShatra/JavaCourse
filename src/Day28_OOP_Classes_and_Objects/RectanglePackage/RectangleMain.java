package Day28_OOP_Classes_and_Objects.RectanglePackage;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 30;
        rectangle1.width = 10;

        int perimeter1 = rectangle1.perimeter();
        int area1 = rectangle1.area();

        System.out.println(perimeter1);
        System.out.println(area1);




    }
}
