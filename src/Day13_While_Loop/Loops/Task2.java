package Day13_While_Loop.Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // get limit from user
        // write a java program which calculates the sum of numbers [0 to limit];
        // using while-loop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter limit: ");
        int limit = scanner.nextInt();


          int counter = 0;
          int total = 0;

          while (counter <= limit) {
            total = total + counter;
            counter++;
        }

        System.out.println(total);




    }
}
