package Day42_Exception;

import java.util.Scanner;

public class Task1 {
    // Using scanner get a number from user as a String
    // Convert this String number into an Integer
    // Handle possible exceptions
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a number: ");

        String userInput = scanner.nextLine();


      // in case that the user entered letters not number
        try {
            int userNumber = Integer.parseInt(userInput);
            System.out.println(userNumber);
        } catch (NumberFormatException ex) {
            System.out.println("your input is invalid!");
        }
    }
}
