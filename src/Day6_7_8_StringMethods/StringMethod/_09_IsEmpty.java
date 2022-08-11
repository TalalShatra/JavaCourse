package Day6_7_8_StringMethods.StringMethod;

public class _09_IsEmpty {

    public static void main(String[] args) {

        String name = "Red";
        System.out.println(name.isEmpty()); // returns boolean

        String space = " "; // space is a character so you'll get false when you use isEmpty method
        System.out.println(space.isEmpty());

        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println(isEmpty);

    }

}
