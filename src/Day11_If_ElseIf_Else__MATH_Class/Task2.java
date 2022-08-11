package Day11_If_ElseIf_Else__MATH_Class;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Get a number from user as int
        // Check if the number is bigger than 100
        // If it is bigger than 100 print "It's bigger than 100"
        // else print "Number is less than or equal to 100"

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int userNumber = scanner.nextInt();
        if (userNumber > 100) {
            System.out.println("It's bigger than 100");
        }
        else {
            System.out.println("Number is less than or equal to 100");
        }




    }


}
