package Day26_Map;
import java.util.HashMap;
import java.util.Set;
public class Task2 {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(7506, "Hawthorne");
        map.put(7505, "Paterson");
        map.put(7504, "Holden");

        Set<Integer> keys = map.keySet();

        for (Integer key : keys)
            System.out.println(key + " => " + map.get(key));


    }
}
