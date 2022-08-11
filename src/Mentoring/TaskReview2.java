package Mentoring;
import java.util.ArrayList;

public class TaskReview2 {
    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Black");
        for (int i = 0; i<color.size() ;i++)
            System.out.println(color.get(i));
        }

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // list = given ArrayList    given = element to add
    // method should add the element at the first index of arraylist
    public static ArrayList<String> addElement (ArrayList<String> list, String given){
        list.add(0,given);
        return list;
    }

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]
    public static ArrayList<String> addBeforLastElement (ArrayList<String> list, String given){
        list.add(list.size()-1,given);
        return list;
    }


}
