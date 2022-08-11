package Day12_Switch_Statement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // if temperature is less than 15 set message to "Cold Weather" otherwise set it to "Cold Weather"
        // USE TERNARY OPERATOR
        // get temperature from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a temperature");
        int temp = scanner.nextInt();

        String weather = temp < 15 ? "Cold Weather" : "Good Weather";
        System.out.println(weather);
    }
}
