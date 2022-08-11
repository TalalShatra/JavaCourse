package Day6_7_8_StringMethods.StringMethod;

public class _03_ToLowerCase {

    public static void main(String[] args) {

        // Strings are immutable
        // when you once create a String you cannot change the value of it
        // we create new String

        String message = "United States of AMERICA";

        String lowerCasedMessage = message.toLowerCase();

        System.out.println(lowerCasedMessage);

    }
}
