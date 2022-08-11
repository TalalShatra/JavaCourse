package Day14_For_Loop;

import java.util.Scanner;

public class TaskDoWhileLoop {
    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787

    public static void main(String[] args) {
        int correctPin = 8787;
        Scanner scan = new Scanner(System.in);
        int pinNumber;

        do {
            System.out.print("Please enter pin number: ");
            pinNumber = scan.nextInt();
        } while (pinNumber != correctPin);

        System.out.println("You're logged in!");



    }
}
