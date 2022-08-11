package Day22_ArrayList;

import java.util.ArrayList;

public class Task2_ArrayList {
    public static void main(String[] args) {
         // Create an Integer ArrayList
        // Initialize with random values (loop - Math)
        // Update all the elements with number 5 (loop)

        ArrayList<Integer> arrayIntList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            arrayIntList.add((int)(Math.random() *10));

        for (int i = 0; i < arrayIntList.size(); i++)
            arrayIntList.set(i, 5);

        System.out.println(arrayIntList);




    }
}
