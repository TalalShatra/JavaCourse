package Day6_7_8_StringMethods.StrigMethodTask;

public class Task3 {

    public static void main(String[] args) {

        String hello = "Hi world,Hello world";

        // check string "Hi world,Hello world" starts with "Hi"

        // part2: check whether second part of the string starts with Hello (after comma)

        boolean isHelloStartsWithHI = hello.startsWith("Hi");

        boolean isSecondPart = hello.startsWith("Hello", 9);

        System.out.println(isHelloStartsWithHI);
        System.out.println(isSecondPart);

        int indexOfComma = hello.indexOf(',');
        boolean secondPart = hello.startsWith("Hello",indexOfComma+1);






    }
}
