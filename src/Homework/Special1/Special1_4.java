package Homework.Special1;

import java.util.Scanner;

public class Special1_4 {
    public static void main(String[] args) {
       //9
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an int");
        int max = scanner.nextInt();
        int random = (int) (Math.random() * max);
        System.out.println(random);
    //10
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter a max int");
        int maxInt = scanner2.nextInt();
        System.out.println("please enter a min int");
        int minInt = scanner2.nextInt();
        int random2 = (int) ((Math.random() * maxInt) - minInt +1);
        System.out.println(random2);
    //11
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter a string");
        String message = scanner3.nextLine();
        int messageLong = message.length();
        if (messageLong %2 ==1){
            System.out.println("true");
        }else {
            System.out.println("false");}
    //12
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("please enter a string");
        String message2 = scanner4.nextLine();
        System.out.println("please enter another string");
        String message3 = scanner4.nextLine();
        if (message2.charAt(message2.length()-(1)) == message3.charAt(0)){
            String newMessage3 = message3.substring(1);
            System.out.println(message2.concat(newMessage3));
        }else{
            System.out.println(message2.concat(message3));}
    }
}
