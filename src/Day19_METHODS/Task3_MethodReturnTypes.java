package Day19_METHODS;

public class Task3_MethodReturnTypes {

    // create a method that takes two numbers and returns their product

    public static void main(String[] args) {
        int product = multiplyOfTwoNumbers(7, 9);
        System.out.println(product);
    }


    public static int multiplyOfTwoNumbers(int number1, int number2) {
        int product = number1 * number2;
        return product;
    }
}
