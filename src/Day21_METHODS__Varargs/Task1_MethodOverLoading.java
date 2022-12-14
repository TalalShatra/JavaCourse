package Day21_METHODS__Varargs;

public class Task1_MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(multiply(5,3));
        System.out.println(multiply(2,3,4));
        System.out.println(multiply(2.1,3.4));
        System.out.println(multiply(1.2, 2.4, 3.6));
        System.out.println(multiply(2.5,3));
        System.out.println(multiply(4, 5.25));
    }

    // create a multiply method, that takes two integers and returns their product as integer
    // overload multiply method, that takes three integers and returns their product as integer
    // overload multiply method, that takes two doubles and returns their product as double
    // overload multiply method, that takes three doubles and returns their product as double
    // overload multiply method, that takes one double and one integer and returns their product as double
    // overload multiply method, that takes one integer and one double and returns their product as double

    public static int multiply (int number1, int number2) {
        return number1 * number2;
    }
    public static int multiply (int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public static double multiply(double number1, double number2, double number3) {
        return number1 * number2 * number3;
    }
    public static double multiply(double number1, int number2) {
        return number1 * number2;
    }
    public static double multiply(int number1, double number2) {
        return number1 * number2;
    }
}
