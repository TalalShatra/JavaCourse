package Day13_While_Loop;

import java.util.Scanner;

public class Task_Casting {
    public static void main(String[] args) {

        // Get 2 numbers from user as a String
        // Convert this numbers to int
        // Sum two integers and print the result

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        String firstNumber = scanner.nextLine();


        System.out.println("please enter a number");
        String secondNumber = scanner.nextLine();

        int intFirstNumber = Integer.parseInt(firstNumber);
        int intSecondNumber = Integer.parseInt(secondNumber);

        int sum = intFirstNumber + intSecondNumber;
        System.out.println(sum);

    }
}
