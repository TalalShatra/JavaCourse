package Day6_7_8_StringMethods.StringMethod;

public class _06_IndexOf {
    public static void main(String[] args) {

        String welcomeMessage = "Welcome to TechnoStudy";

        int indexOfUpperW = welcomeMessage.indexOf('W');

        System.out.println(indexOfUpperW);

        int indexOfLowerW = welcomeMessage.indexOf('w');

        System.out.println(indexOfLowerW);

        int indexOfFirstT = welcomeMessage.indexOf('t'); // will return the index of first matching character

        System.out.println(indexOfFirstT);

        int indexOfSecondT = welcomeMessage.indexOf('t', 9);

        System.out.println(indexOfSecondT);

    }
}
