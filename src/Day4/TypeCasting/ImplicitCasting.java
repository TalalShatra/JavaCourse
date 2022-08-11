package Day4.TypeCasting;

public class ImplicitCasting {

    // Implicit Casting (Automatic) - Widening Casting
    // byte -> short -> int -> long -> float -> double
    public static void main(String[] args) {

        byte byteNumber = 10;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);

        int intNumber = 1234565678;
        long longNumber = intNumber;
        System.out.println(longNumber);


        float floatNumber = 5.35F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        double doubleNumber2 = 5;
        System.out.println(doubleNumber2);
        // it will print as double 5.0

        double a = 2.1;
        double b = a + 3;
        // 3 is integer and here will convert to double


        short shortAge = 35;
        long longAge = shortAge;
        System.out.println(shortAge);

        float floatArea = 2.556F;
        double doubleArea = floatArea;
        System.out.println(doubleArea);

        byte byteAge = 26;
        float floatAge = byteAge;
        System.out.println(floatAge);



    }



}
