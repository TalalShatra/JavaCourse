package Mentoring;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskSet1 {
    //Create a java class with a Scanner class and get people names from the user.
    //Keep getting values until the input is "STOP"
    //Store all of these values inside a Set,
    //print
    //"Your names list consists of: [Alex, Angela, Brian..."
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        Set<String> namesList = new HashSet<>();

        while (true){
            System.out.println("please Enter your Name");
            name = scanner.nextLine();

            if (name.equals("STOP"))
                break;
            else
                namesList.add(name);
        }
        System.out.println("Your names list consists of: " + namesList);

        //Secondly create one more condition where if the user types "remove" ask the user
        //"Who'd you like to remove?" and remove that person from the Set

        /*if (name.equals("STOP"))
                break;
           else if (name.equals("remove")) {
                System.out.println("Who'd you like to remove? ");
                name = input.nextLine();
                namesList.remove(name);
            }
            else
                namesList.add(name);

 */

    }
}
