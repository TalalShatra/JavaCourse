package Day6_7_8_StringMethods;

import java.awt.*;

public class _02_PrimitiveVsReference {
    public static void main(String[] args) {

        int x = 3;
        int y = x;  // int y = x's value
        System.out.println(x);
        System.out.println(y);
        // if we change the value of x then y value will not change
        x=5;
        System.out.println(x);  // 5
        System.out.println(y);  // 3
        // Primitive Types are copied the value

        Point point = new Point(3,2);
        Point point2 = point;
        System.out.println(point);
        System.out.println(point2);
        // if we change the value of point1 then point2 value will change
        point.x =0;
        System.out.println(point);
        System.out.println(point2);
        /* the values are stored in reference place
        and any change both will be effected
         */








    }
}
