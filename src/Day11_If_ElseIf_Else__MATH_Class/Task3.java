package Day11_If_ElseIf_Else__MATH_Class;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // get string input from the user
        // if it contains 'a' and 'b', print "The input contains both a and b"
        // if input only contains a print "The input contains a"
        // if input only contains b print "The input contains b"
        // else print "The input does not contains both a and b"

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a string: ");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.contains("a") && userInput.contains("b")) {
            System.out.println("The input contains both a and b");
        } else if (userInput.contains("a")) {
            System.out.println("The input contains a");
        } else if (userInput.contains("b")) {
            System.out.println("The input contains b");
        }
        else {
            System.out.println("The input does not contains both a and b");
        }
    }
}
