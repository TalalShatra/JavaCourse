package Homework.Special1;

import java.util.Scanner;

public class Special1_2 {
    public static void main(String[] args) {
        //4
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an int");
        int userInt = scanner.nextInt();
        switch (userInt) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("this is not a valid day");}


    }
}
