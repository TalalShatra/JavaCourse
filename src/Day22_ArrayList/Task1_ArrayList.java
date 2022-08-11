package Day22_ArrayList;
import java.util.ArrayList;

public class Task1_ArrayList {
    public static void main(String[] args) {

        // Create a Double ArrayList
        ArrayList<Double> arrayList = new ArrayList<>();

        // Add some Doubles into ArrayList
        arrayList.add(1.5);
        arrayList.add(3.9);
        arrayList.add(5.8);
        arrayList.add(0.4);
        // Adding 6 random doubles into arrayList
        for (int i = 0; i < 6; i++)
        arrayList.add(Math.random() * 100);


        // Print all the elements of ArrayList (every element in a new line)
        for (int i=0; i< arrayList.size(); i++)
        System.out.println(arrayList.get(i));
    }
}
