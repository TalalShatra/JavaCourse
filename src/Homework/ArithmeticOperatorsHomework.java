package Homework;

import java.util.Scanner;

public class ArithmeticOperatorsHomework {
    public static void main(String[] args) {

    //1
        double a = 30;
        double b = 6;
        double result1 = (double) a / b;
        System.out.println(result1);
    //2
        int x = 20;
        int y = 4;
        int result2 = x/y;
        System.out.println(result2);
    //3
        double c = 3.3;
        double d = 1.9;
        double e = 20.6;
        double result3 = (double) c * d * e;
        System.out.println(result3);
    //4
        double l = 2.3;
        double m = 4.8;
        double n = 10.2;
        double o = 1.1;
        double result4 = (double) l * m * n * o;
        System.out.println(result4);
    //5
        int f = 5;
        int g =3;
        int h = 8;
        int k = 7;
        int result5 = f * g * h * k;
        System.out.println(result5);
    //6
        int p = 10;
        p %= 3;
        System.out.println(p);
    //7
        int q = 22;
        q %= 4;
        System.out.println(q);
    //8
        int r = 35;
        r %=11;
        System.out.println(r);
    //9
        int s = 50;
        int t = 10;
        System.out.println( s / t);
    //10
        int a1 = 90;
        int a2 = 45;
        int a3 = 20;
        int a4 = 5;
        System.out.println(a1 - a2 - a3 - a4);
    //11
        int b1 = 12;
        int b2 = 16;
        System.out.println(b1 + b2);
    //12
        int c1 = 30;
        int c2 = 20;
        int c3 = 25;
        int c4 = 41;
        System.out.println(c1 + c2 + c3 + c4);
    //13
        int d1 = 10;
        int d2 = 20;
        int d3 = 12;
        int total = d1+d2+d3;
        System.out.println(total);

    //14
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number");

        double number1 = (double) scanner.nextDouble();
        System.out.println("please enter second number");

        double number2 = (double) scanner.nextDouble();
        System.out.println("please enter third number");

        double number3 = (double) scanner.nextDouble();
        System.out.println("please enter fourth number");

        double number4 = (double) scanner.nextDouble();
        double result = (double) ((number1 * number2) / (number3 + number4));
        System.out.println(result);







    }
}
