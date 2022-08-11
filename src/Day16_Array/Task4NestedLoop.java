package Day16_Array;

public class Task4NestedLoop {
    public static void main(String[] args) {

// create following pattern
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 0; i < 5; i++) {

            for  (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }

        // or

        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
