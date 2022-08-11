package Day6_7_8_StringMethods.StrigMethodTask;

public class Task1 {

    public static void main(String[] args) {
       /* Create 2 Strings:
        firstString = "123456789";
        secondString = "0123456789"

        Part1: find out the length of firstString
        Part2: find out the length of secondString

        */

        String firstString = "123456789";
        String secondString = "0123456789";

        int lengthOfFirstString = firstString.length();
        int lengthOfSecondString = secondString.length();

        System.out.println("Length Of First String: " + lengthOfFirstString);
        System.out.println("Length Of Second String: " + lengthOfSecondString);

    }
}
