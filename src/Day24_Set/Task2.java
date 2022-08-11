package Day24_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Task2 {

    // Task
    // create a arraylist of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values
    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(3);
        numArray.add(1);
        numArray.add(2);
        numArray.add(4);
        numArray.add(5);
        numArray.add(3);

        int duplicate = 0;


        Set<Integer> numSet = new HashSet<>();
        ArrayList<Integer> duplicatedValue = new ArrayList<>();

        for (int i = 0; i< numArray.size(); i++){
           boolean isAdded = numSet.add(numArray.get(i));
           if (!isAdded){
               duplicate++;
               duplicatedValue.add(numArray.get(i));
           }
        }
        System.out.println(duplicate);
        System.out.println(duplicatedValue);

    }
    /*  Mert solution:

        Set<Integer> integerSet = new HashSet<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(3);
        Set<Integer> duplicatesList = new HashSet<>();

        for (Integer element : integerArrayList) {
            if (!integerSet.add(element))
                duplicatesList.add(element);
        }

        System.out.println("Amount of duplicates are: " + duplicatesList.size());
        System.out.println("Duplicates are: " + duplicatesList);

    }
     */
}
