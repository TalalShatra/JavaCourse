package Day16_Array;

public class Task3NestedLoop {
    public static void main(String[] args) {

        // print the following pattern
        // *
        // **
        // ***
        // ****

        for (int i = 0; i < 4; i++) {

            for  (int j = 0; j<= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
