package Homework.IfElse1;

import java.util.Scanner;

public class ifElse1_3 {
    public static void main(String[] args) {

    //9
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer");
        int int1 = scanner.nextInt();
        if ( int1 %4 == 3 ){
            System.out.println("Remainder is 3");
        } else if (int1 %4 == 2) {
            System.out.println("Remainder is 2");
        } else if (int1 %4 == 1) {
            System.out.println("Reminder is 1");
        }else {
            System.out.println("Reminder is 0");}

    //10
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter first double");
        double number = scanner.nextDouble();
        System.out.println("please enter second double");
        double number2 = scanner.nextDouble();
        if (number > number2 * 2){
            System.out.println("Hello World");
        } else if (number < number2 * 2) {
            System.out.println("Not Hello World");
        }else {
            System.out.println("I love java");}

    }
}
