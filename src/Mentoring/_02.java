package Mentoring;

import java.util.Scanner;

public class _02 {

    public static void main(String[] args) {

        //Ask the user for a String which you will use this string throughout all your tasks
        //Write a code that will print the last 3 letters of the String
        System.out.println("Please enter a string");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput.substring(userInput.length()-3));


        //Write a code that returns the position of first appearance of the letter 'a'
        //and last appearance of the string

        System.out.println(userInput.indexOf('a') + "" + userInput.lastIndexOf('a'));

        //Write a code that will replace the last letter of that String with the "a"

        System.out.println("Please enter a String");
        String userInput2 = scanner.nextLine();
        userInput2 = userInput2.substring(0,userInput2.length()-1) + "m";
        System.out.println(userInput2);

    }
}
