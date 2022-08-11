package Day26_Map;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    // TASK
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists= new ArrayList<>();

        ArrayList<String> employees = new ArrayList<>();
        Collections.addAll(employees, "A", "B", "c");

        ArrayList<String> employers = new ArrayList<>();
        employers.add("D");
        employers.add("E");
        employers.add("F");
   // Collections.addAll

        ArrayList<String> companies = new ArrayList<>();
        companies.add("G");
        companies.add("H");
        companies.add("I");
    // Collections.addAll


        Collections.addAll(listOfLists, employees, employers, companies);

        System.out.println(listOfLists);




    }
}
