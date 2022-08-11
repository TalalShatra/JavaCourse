package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewTask1 {
    public static void main(String[] args) {

        // multiplication from 1 to 10 (1X1=1, 1x2=2,...., 10x10=100)
        int product;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                product = i * j;
                System.out.println(i + "x" + j + '=' + product);
            }
        }

        // output gonna be the fibonacci numbers
        int numb = 10;
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= numb; i++) {
            sum = a + b;
            System.out.print(sum + " ");

            a = b;
            b = sum;
        }

        // finding out the number of digits of integer number (235743) = 6 digits
        int num = 235743;
        int originalNum = num;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("number of digits of " + originalNum + " = " + count);

        // reversed Integer value
        int number = 741253;
        int reversedNumb = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumb = reversedNumb*10+remainder;
            number = number/10;
        }
        System.out.println(reversedNumb);

        // reversed String
        String name = "yoldas";
        String revName ="";
        for ( int i = name.length()-1; i>=0; i--){
            revName += name.charAt(i);
        }
        System.out.println(revName);

        // reversed Array
        char[] letter = {'a', 'b', 'c', 'd'};

        for( int i= letter.length-1; i>=0;i--){
            System.out.print(letter[i]);
        }

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int userNumber = scanner.nextInt();
        boolean isItPrime = false;

        for (int i = 2; i < userNumber; i++) {
            if(userNumber % i == 0){
                isItPrime = true;
                break;
            }
        }

        if (!isItPrime)
            System.out.println(userNumber + " is prime.");
        else
            System.out.println(userNumber + " is not prime");

        // is it palindrome (like 12321)

        int number2 = 12321;
        int originalNum2 = number2;
        int revNumber2=0;
        while(number2>0){
            int remainder = num%10;
            revNumber2 = revNumber2*10 + remainder;
            number2 = number2/10;
        } if (revNumber2==originalNum2){
            System.out.println("is a palindrome");
        } else System.out.println("is not a palindrome");

        // max value in array
        int [] arr = {12, 25, 6, 54, 43};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);




    }
}