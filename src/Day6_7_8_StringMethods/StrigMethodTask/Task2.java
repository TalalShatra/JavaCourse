package Day6_7_8_StringMethods.StrigMethodTask;

public class Task2 {
     /*Create following String:
        String numbers = "0.12345678";

    part1: find the index of 4 in numbers String
    part2: find the index of . in numbers String

      */

    public static void main(String[] args) {

        String numbers = "0.12345678";
        int indexOfNumber4 = numbers.indexOf("4");
        int indexOfDot = numbers.indexOf(".");

        System.out.println("Index Of Number 4 is " + indexOfNumber4);
        System.out.println("Index Of Dot is " + indexOfDot);




    }
}
