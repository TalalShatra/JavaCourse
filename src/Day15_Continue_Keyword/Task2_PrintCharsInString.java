package Day15_Continue_Keyword;

import java.util.Scanner;

public class Task2_PrintCharsInString {
    public static void main(String[] args) {
        // INTERVIEW QUESTION
        // Write program to print chars from a String
        // 1- Get a String from user
        // 2- Print each char from string

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a String");
        String x = scanner.nextLine();

        for ( int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }


    }
}
