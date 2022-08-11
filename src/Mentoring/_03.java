package Mentoring;

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        // -Get a number from user
        //    -If the number is greater than 0, print “the number is positive”
        //    -Else, print “the number is not positive”


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();

        if  (userInput > 0) {
            System.out.println(userInput + " is positive number");

        }else
            System.out.println(userInput + " is not positive number");


    }
}
