package Homework.Special1;

import java.util.Scanner;

public class Special1_1 {
    public static void main(String[] args) {

    //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        if ( age <10){
            System.out.println("too young to have a Facebook account");
        } else if ( age <= 16) {
            System.out.println("too young to get a driver licence");
        } else if ( age <= 18) {
            System.out.println("too young to get a tattoo");
        } else if ( age < 21) {
            System.out.println("too young to drink alcohol");
        } else if ( age >= 18) {
            System.out.println("do whatever you want to do");}
    //2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner2.nextInt();
        if ( number %2 == 0){
            System.out.println("true");
        }else if( number %2 == 1){
            System.out.println("false");}
    //3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter a string");
        String userStr = scanner3.nextLine();
        int counter = 0;
        for ( int i = 0; i< userStr.length(); i++){
            if (userStr.charAt(i) == ('b'))
                counter +=1;
        }
        System.out.println(counter);


        }
    }

