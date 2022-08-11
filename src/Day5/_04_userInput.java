package Day5;

import java.util.Scanner;

public class _04_userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a number");
        int userInt = scanner.nextInt();
        System.out.println("Integer from user: " + userInt);


        System.out.println("Please enter a byte");
        int userByte = scanner.nextByte();
        System.out.println("Byte from user: " + userByte);









    }
}
