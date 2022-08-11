package Mentoring;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        int age = 19;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt();
        System.out.println( " Your number is: " + userNumber);


// Average of 3 student grades
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter FirstGrade");
        float number1 = scanner.nextInt();

        System.out.println("Enter SecondGrade");
        float number2 = scanner.nextInt();

        System.out.println("Enter ThirdGrade");
        float number3 = scanner.nextInt();

        System.out.println("Average is =" + (float)(number1 + number2 + number3)/3);






    }
}
