package Mentoring;
import java.util.ArrayList;
public class TaskReview3 {
    public static void main(String[] args) {

}
    // TASK
    // part 1:
    // create a method that will create an arrayList of integers
    // with 5 random numbers(1 to 10) and return the created ArrayList

    public static ArrayList<Integer> randomNumbersArrayList(){
        ArrayList<Integer> random = new ArrayList<>();
        for ( int i = 0; i <5; i++);
        random.add((int)(Math.random()*9 +1));
        return random;
    }

    // part 2:
    // create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static  ArrayList<Integer> replaceArrayList(ArrayList<Integer> list, int given){
        list.set((list.size()/2), given);
        return list;
    }
}
