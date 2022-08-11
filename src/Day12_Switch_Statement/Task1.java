package Day12_Switch_Statement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ask number from user between  0  and 5
        // generate a random number between 0 - 5
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"
        // Note: if number user provide is between 0 - 5 run program, else print "Invalid"

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number between 0 and 5: ");
        int userNumber = scanner.nextInt();
        int randomNumber = (int) (Math.random() * 6);

        if  (userNumber >= 0 && userNumber <= 5)
        {


            if  (userNumber == randomNumber)
            {
                System.out.println("you win");

            } else
             {
                System.out.println("you lose random number is: "+ randomNumber);
             }

        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
