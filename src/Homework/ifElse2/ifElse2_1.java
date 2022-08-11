package Homework.ifElse2;

import java.util.Scanner;

public class ifElse2_1 {
    public static void main(String[] args) {

    //1
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter quiz score");
        int quizScore = scan.nextInt();
        System.out.println("please enter mid term score");
        int midTermScore = scan.nextInt();
        System.out.println("please enter final score");
        int finalScore = scan.nextInt();
        int average = (quizScore + midTermScore + finalScore) / 3;
        if ( average >= 90){
            System.out.println("your grade is A");
        } else if ( average < 90 && average >= 70) {
            System.out.println("your grade is B");
        } else if ( average < 70 && average >= 50) {
            System.out.println("your grade is C");
        }else if ( average < 50) {
            System.out.println("your grade is F");
        }


    //2
        Scanner scan2 = new Scanner(System.in);
        System.out.println("please enter first integer");
        int num1 = scan2.nextInt();
        System.out.println("please enter second integer");
        int num2 = scan2.nextInt();
        System.out.println("please enter third integer");
        int num3 = scan2.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 >num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }



    }
}
