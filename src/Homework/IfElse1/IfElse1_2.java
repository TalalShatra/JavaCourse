package Homework.IfElse1;

import java.util.Scanner;

public class IfElse1_2 {
    public static void main(String[] args) {

    //5
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a double");
        double double1 = scanner.nextDouble();
        if (double1 %5 == 0 && double1 %8 ==0){
            System.out.println("able to divide by 5 and 8");
        }else if (double1 %3 == 0 || double1 %7 ==0){
            System.out.println("able to divide by 3 or able to divide by 7");}
    //6
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please enter a String");
        String string1 = scanner1.nextLine();
        if (string1.contains("€")){
            System.out.println("This is euro");
        } else if (string1.contains("$")) {
            System.out.println("This is dollar");
        }else {
            System.out.println("no money");}
    //7
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter a String");
        String string2 = scanner2.nextLine();
        if (string2.contains("Orange") && string2.length() == 6){
            System.out.println("Orange has six letters");
        } else if (string2.contains("Apple") && string2.length() == 5){
            System.out.println("Apple has five letters");
        } else  if (string2.contains("Orange") && string2.length() > 10){
                System.out.println("String contains orange and length is more then 10");}
    //8
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter an integer");
        int int1 = scanner3.nextInt();
        if ( int1 % 2 == 0){
            System.out.println("number is a EVEN number");
        } else {
            System.out.println("number is a ODD number");}


    }
}
