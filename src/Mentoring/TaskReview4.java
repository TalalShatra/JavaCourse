package Mentoring;
import java.util.ArrayList;
public class TaskReview4 {
//Task 1:
        //    1-Create one method name is getCount()
        //    Parameter is one (String ArrayList,  String)
        //    return type is int.
        //    Count how many times your parameter String occurs in the arraylist and return the count
        //    For Example:
        //    ArrayList is [Orange , Kiwi , Peach , Banana , Orange]
        //    String is Orange
        //    count should be 2
        public static int getCount(ArrayList<String> list, String given){
            int counter = 0;
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).equalsIgnoreCase(given))
                    counter++;}
          return counter;
         }
//Task 2:
    //    Create a method name is getSum()
    //    Parameter is ArrayList
    //    Return type is int
    //    Sum all the numbers in the ArrayList
    //    Return the result
    //    For Example:
    //    Arraylist is 1,2,3,4,5
    //    return should be 15

    public static int getSum(ArrayList<Integer> list){
            int result = 0;
            for (int i = 0; i < list.size(); i++)
                result += list.get(i);
        return result;
    }



}
