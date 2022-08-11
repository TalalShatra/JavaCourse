package Homework.IfElse1;

import java.util.Scanner;

public class IfElse1_1 {
    public static void main(String[] args) {

    //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first double");
        double double1 = scanner.nextDouble();
        System.out.println("please enter second double");
        double double2 = scanner.nextDouble();
        if (double1 > double2){
            System.out.println("double 1 is greater than double 2");
        } else if (double1 < double2){
            System.out.println("double 1 is smaller than double 2");}
    //2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter int 1");
        int integer1 = scanner2.nextInt();
        System.out.println("please enter int 2");
        int integer2 = scanner2.nextInt();
        if (integer1 > integer2){
            System.out.println("int 1 is greater than int 2");
        } else if (integer1 < integer2){
            System.out.println("int 1 is smaller than int 2");}
    //3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter String 1");
        String string1 = scanner3.nextLine();
        System.out.println("please enter String 2");
        String string2 = scanner3.nextLine();
        if (string1 == string2){
            System.out.println("String 1 is equal to String 2");
        } else{
            System.out.println("String 1 is NOT equal to String 2");}
    //4
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("please enter int");
        int integer3 = scanner4.nextInt();
        if (integer3 == 0){
            System.out.println("Im neutral");
        } else if (integer3 > 0){
            System.out.println("I m positive");
        } else{
            System.out.println("I am negative");}








    }
}
