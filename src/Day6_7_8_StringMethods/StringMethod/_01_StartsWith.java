package Day6_7_8_StringMethods.StringMethod;

public class _01_StartsWith {

    public static void main(String[] args) {

        String message = "Hello World";

        boolean isMessageStartsWithHello = message.startsWith("Hello");

        System.out.println(isMessageStartsWithHello);


        boolean isSecondWordStartsWithW = message.startsWith("W",6);
        // index always starts from 0 that mean w is 0 index

        System.out.println(isSecondWordStartsWithW);
    }
}
