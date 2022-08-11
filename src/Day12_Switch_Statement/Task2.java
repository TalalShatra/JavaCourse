package Day12_Switch_Statement;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // get a number from user
        // if the number is larger than zero, get another number from user,
        // if second number is larger than 5 print  else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"

        // think of the first number as temperature
        // second number is atmospheric pressure
        // and your code is doing diagnostics

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a temperature");
        int temp = scanner.nextInt();

        if  (temp > 0)
        {
            System.out.println("please enter atmospheric pressure");
            int atm = scanner.nextInt();
            if (atm > 5) {
                System.out.println("ok");
            }
            else {
                System.out.println("not ok");
            }

        }
        else {
            System.out.println("too cold to check");
        }
    }
}
