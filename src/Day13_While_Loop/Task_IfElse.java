package Day13_While_Loop;

import java.util.Scanner;

public class Task_IfElse {
    public static void main(String[] args) {
// Take two numbers from the user and print the greatest number
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("please enter second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {

            if (firstNumber > secondNumber) {
                System.out.println("The greatest number is: " + firstNumber);
            } else {
                System.out.println("The greatest number is: " + secondNumber);
            }

        }



    }
}
