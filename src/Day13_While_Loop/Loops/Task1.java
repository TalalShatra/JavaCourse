package Day13_While_Loop.Loops;

public class Task1 {
    public static void main(String[] args) {
        // write a java program which calculates the sum of numbers [0 to 5];
        // using while-loop

        // 0 + 1 + 2 + 3 + 4 + 5

        int counter = 0;
        int total = 0;

        while (counter <= 5) {
            total = total + counter;
            counter++;
        }

        System.out.println(total);



    }
}
