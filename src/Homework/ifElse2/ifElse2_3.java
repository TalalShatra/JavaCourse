package Homework.ifElse2;

import java.util.Scanner;

public class ifElse2_3 {
    public static void main(String[] args) {
        //4
        int extra;
        Scanner scan = new Scanner(System.in);
        System.out.println("have a driver licence");
        boolean DLAvailable = scan.nextBoolean();
        String dLString = String.valueOf(DLAvailable);
        if (dLString.contains("false")) {
            extra = 200;
           Scanner scan2 = new Scanner(System.in);
           System.out.println("enter the speed");
           int speed = scan2.nextInt();
           int fine;
           if (speed>= 55 && speed <= 74){
               fine = 100 + extra;
               System.out.println(fine + "$");
           }else if (speed >= 75 && speed <= 84) {
               fine = 150 + extra;
               System.out.println(fine + "$");
           } else if (speed >= 85 && speed <= 94) {
               fine = 320 + extra;
               System.out.println(fine + "$");
           } else if (speed > 94) {
               fine = 500 + extra;
               System.out.println(fine + "$");}
        } else if (dLString.contains("true")) {
            extra = 0;
            Scanner scan2 = new Scanner(System.in);
            System.out.println("enter the speed");
            int speed = scan2.nextInt();
            int fine;
            if (speed>= 55 && speed <= 74){
                fine = 100 + extra;
                System.out.println(fine + "$");
            }else if (speed >= 75 && speed <= 84) {
                fine = 150 + extra;
                System.out.println(fine + "$");
            } else if (speed >= 85 && speed <= 94) {
                fine = 320 + extra;
                System.out.println(fine + "$");
            } else if (speed > 94) {
                fine = 500 + extra;
                System.out.println(fine + "$");
            }
        }


    }
}
