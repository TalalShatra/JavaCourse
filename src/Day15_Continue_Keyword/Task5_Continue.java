package Day15_Continue_Keyword;

import java.util.Scanner;

public class Task5_Continue {
    public static void main(String[] args) {
        // get text from the user, print each letter in a new line
        // skip space or semi-column characters

       /*   my Solution:

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a String");
        String x = scanner.nextLine();

        for ( int i = 0; i < x.length(); i++) {
            if (x.charAt(i)==(' ') || x.charAt(i)==(';'))
                continue;
            System.out.println(x.charAt(i));
        }
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter input: ");
        String userInput = scanner.nextLine();

        char character;

        for (int i = 0; i < userInput.length(); i++) {
            character = userInput.charAt(i);

            if (character == ' ' || character == ';')
                continue;

            System.out.println(character);
        }
    }
}
