package Homework.ifElse2;

import java.util.Scanner;

public class ifElse2_2 {
    public static void main(String[] args) {

     //3
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first integer");
        int num1 = scan.nextInt();
        System.out.println("please enter second integer");
        int num2 = scan.nextInt();
        System.out.println("please enter third integer");
        int num3 = scan.nextInt();
        if (num1 < num2 && num1 < num3) {
                System.out.println(num1);
        } else if (num2 < num1 && num2 <num3) {
                System.out.println(num2);
        } else if (num3 < num1 && num3 < num2){
                System.out.println(num3);}



    }
    }

