package Day14_For_Loop;

import java.util.Scanner;

public class TaskWhileLoop {
    public static void main(String[] args) {
        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        int correctPin = 8787;
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter pin number");
        int pinNumber = scan.nextInt();


        while (pinNumber != correctPin){
            System.out.print("your pin number is incorrect, try again");
            pinNumber = scan.nextInt();

        }
        System.out.println("you are logged in");
    }
}
