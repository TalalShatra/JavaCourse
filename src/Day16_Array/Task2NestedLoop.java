package Day16_Array;

public class Task2NestedLoop {
    public static void main(String[] args) {

        //print following pattern
        // *****
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
