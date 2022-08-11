package Day10_IfStatement_withComparisonOperators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c'
        // check if it does NOT contain 'c'
        // check if it does not contain both 'c' and 'd'

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string");
        String userInput = scanner.nextLine();

        boolean containsAAndB = userInput.contains("a") && userInput.contains("b");
        System.out.println("UserInput contains A and B: " + containsAAndB);

        boolean containsAOrC = userInput.contains("a") || userInput.contains("c");
        System.out.println("UserInput contains A or C: " + containsAOrC);

        boolean notContainsC = !userInput.contains("c");
        System.out.println("UserInput does not contains C: " +notContainsC);

        boolean notContainsCAndD = !userInput.contains("c") && !userInput.contains("d");
        System.out.println("UserInput does not contains C and D: " +notContainsCAndD);







    }
}
