package Day10_IfStatement_withComparisonOperators;

import java.util.Scanner;

public class Task2 {
    // get an int from user
    // if it is greater than 100, print "PASSED"
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer");
        int userInput = scanner.nextInt();
        if (userInput > 100) {
            System.out.println("PASSED");
        }
    }
}
