package Homework.ReturnTypes;

public class NotVoid {
    public static void main(String[] args) {
        int numberOfLetters = lettersInt("abcde123");
        System.out.println(numberOfLetters);
    }
    /*-1-Create a method which checks if length of string is at least 8 characters,
     it returns true or false (Return Type should be boolean)
     */
    public static boolean checkLength(String str) {
        // boolean is8 = str.length()>= 8;
        // return is8;}
        return str.length() >= 8;}

    /* -2-Create a method which checks if character is letter
     (Return Type should be boolean)
     */
        public static boolean check (char character){
            boolean isLetter = false;
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                isLetter = true;
            return isLetter;}
    /*-3-Create a method which counts letters in given string (Return Type should be int)
        example input: "abcde123"
        example output: 5
                */
        public static int lettersInt (String message) {
            int counter = 0;
            for ( int i = 0; i < message.length(); i++){
                if(Character.isLetter(message.charAt(i)))
                // char character = message.charAt(i);
                // if (check(character))
                 counter++;}
            return counter; }
    /*-4-create a method which checks if character is digit (Return Type should be boolean)
    hint: character >= '0' && character <= '9' (digits)
     */
        public static boolean digit (char character){
            boolean isDigit = false;
            if ((character >= '0') && (character <= '9'))
                isDigit = true;
            return isDigit;}
            // return (character >= '0' && character <= '9');
    }