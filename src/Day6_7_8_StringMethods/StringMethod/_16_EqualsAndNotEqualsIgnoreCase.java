package Day6_7_8_StringMethods.StringMethod;

public class _16_EqualsAndNotEqualsIgnoreCase {

    public static void main(String[] args) {

        String string1 = "TechnoStudy";
        String string2 = "TechnoStudy";
        String string3 = "TECHNOSTUDY";

        System.out.println(string1.equals(string2));

        System.out.println(string1.equals(string3));

        System.out.println(string1.equalsIgnoreCase(string3));

    }
}
