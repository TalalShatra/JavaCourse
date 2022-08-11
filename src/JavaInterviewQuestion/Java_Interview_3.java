import java.awt.desktop.AboutEvent;
import java.util.*;

public class Java_Interview_3 {

    public static void main(String[] args) {

//  int product = 1;
//  for (int i=1; i<=10; i++){
//
//      for(int j=1; j<=10; j++){
//
//          product = i*j;
//
//          System.out.println(i+"X"+j+"="+product);
//      }
//
//  }

        //Q=2 output is gonna be the fibonacci numbers?
//        int num=10;
//        int a=0;
//        int b=1;
//        int sum=0;
//
//        for (int i=1; i<=num; i++){
//
//            sum =a+b;
//            System.out.print(sum+" ");
//
//            a=b;
//            b=sum;
//        }

        //Q-3 finding out the number of digits in a given number?
//        int num = 234746;
//        int count =0;
//        int orgNumber =num;
//
//        while(num>0){
//            num = num/10;
//            count++;
//        }
//        System.out.println("the number of digits of "+orgNumber+ " = "+count);
//


//Q-4
//        int num = 741253;
//        int reversed = 0;
//
//        while(num>0){
//            int remainder = num%10;
//            reversed=reversed*10+remainder;
//
//            num= num/10;
//        }
//        System.out.println(reversed);

        //Q-5  getting the reverse of a string value ?

//String name = "yoldas";
//String revName = "";
//
//for (int i=name.length()-1 ; i>=0 ; i--){
//
//    revName += name.charAt(i);
//
//}
//        System.out.println(revName);


//        //Q-5 getting the reverse of an Array ?
//
//        char [] letter = {'a','b','c','d'};
//
//        for(int i=letter.length-1; i>=0; i--){
//
//            System.out.print(letter[i]);
//        }

        //Q-6 getting the prime number?
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = scan.nextInt();
//        boolean result= false;
//        for(int i=2; i<num ; i++){
//
//            if(num%i==0){
//                result = true;
//                break;
//            }
//        }
//        if(!result){
//            System.out.println(num+" is a prime number");
//        } else System.out.println(num+" is not a prime number");

        //Q-7 getting to know that a given number is palindrome or not?

//        int num = 23543;
//        int revNum=0;
//        int orgNum = num;
//
//        while(num>0){
//            int remainder = num%10;
//            revNum = revNum*10 + remainder;
//            num = num/10;
//        } if(revNum==orgNum){
//            System.out.println(orgNum+" is a palindrome");
//        } else System.out.println(orgNum+" is not a palindrome");


//Q-8 getting the largest number in int array ?
        int [] arr = {12, 25, 6, 9, 54, 43};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


    }


}
