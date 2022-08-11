package Day10_IfStatement_withComparisonOperators;

import java.util.Scanner;

public class Task3 {

// Get an integer from user
    // if it is greater than 0 - print POSITIVE
    // if it is equal to 0 - print ZERO
    // if it is less than 0 - print NEGATIVE
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter an Integer");
    int userInput = scanner.nextInt();

    if (userInput > 0) {
        System.out.println("POSITIVE");
    }

    if (userInput == 0) {
        System.out.println("ZERO");
    }

    if (userInput < 0) {
        System.out.println("NEGATIVE");
    }
}


}
