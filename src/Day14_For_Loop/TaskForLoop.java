package Day14_For_Loop;

public class TaskForLoop {
    public static void main(String[] args) {

        // PART 1
        // print numbers from 0 to 20 using for-loop
        // output should be in one line: 0 1 2 3 ... 20

        // PART 2
        // print numbers from 20 to 0 using for-loop
        // output should be in one line: 20 19 18 ... 0

        for (int i =0; i <= 20; i++) {
            System.out.print(i+" ");
        }


        System.out.println();// just new line to separate the 2 loops


        for (int i =20; i >= 0; i--) {
            System.out.print(i+" ");
        }



    }
}
