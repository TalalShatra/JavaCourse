package Day15_Continue_Keyword;

import java.util.Scanner;

public class Task4_Continue {
    public static void main(String[] args) {
        // get number from the user, print all the numbers from 0 to the number from user
        // skip even numbers using continue

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++){
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

    }
}
