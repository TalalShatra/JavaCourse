package Day15_Continue_Keyword;

import java.util.Scanner;

public class Task1_SumOfNumbersFromUser {
    public static void main(String[] args) {
        // get limit from user
        // write a java program which calculates the sum of numbers [0 to limit];
        // using for-loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a limit");
        int limit = scanner.nextInt();
        int sum = 0;


        for (  int i = 0; i<= limit; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
