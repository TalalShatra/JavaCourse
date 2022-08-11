package Day5;

import java.util.Scanner;

public class _01_userInput {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in); // letting java know that we'll read user input
        String userInput = scanner.nextLine(); // storing the entered text in string variable
        System.out.println("you name: " + userInput);
        /* scanner class to read user input
        Scanner scanner = new Scanner(System,in)
         */







    }
}
