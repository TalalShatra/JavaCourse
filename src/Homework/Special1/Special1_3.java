package Homework.Special1;

import java.util.Scanner;

public class Special1_3 {
    public static void main(String[] args) {
    //5
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an int");
        int userInt = scanner.nextInt();
        int FactorialValue = 1;
        for (int i=1; i <= userInt; i++){
            FactorialValue = FactorialValue * i;
        }System.out.println(FactorialValue);
    //6
        Scanner scanner2 = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<4; i++){
            System.out.println("please enter the price includes $ sign");
            String numI = scanner2.nextLine();
            String newNumI = numI.substring(1);
            int numIntI =Integer.parseInt(newNumI);
            sum = sum + numIntI;}
                if (sum>=0){
                    System.out.println(sum);
                } else if (sum<0) {
                    System.out.println(-1);}
    //7
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter an int");
        int number = scanner3.nextInt();
        for ( int i =1; i<=100; i++){
         int squareI = i * i;
         if ( squareI == number){
             System.out.println(i);}}
    //8
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("please enter an int");
        int number2 = scanner4.nextInt();
        for ( int i =0; i<= number; i +=2){
            System.out.print(i + " ");}


    }
}
