package Day27_Collectios_Map_Recap;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

//        HashMap<String, Integer> hashMap = new HashMap<>();
        //        hashMap.put("One", 1);
        //        hashMap.put("Two", 2);
        //        hashMap.put("Three", 3);
        //        hashMap.put("Four", 4);
        //        hashMap.put("Five", 5);

        // Map is given above:
        // check, does this map contain key "Six"
        // if it does not contain key "Six", put as "Six" = 6

        // part 2: check does this map contain key "Three"
        // if it contains key "Three", change the value of it to 33


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        //1
        // solution1
        boolean containsKeySix = hashMap.containsKey("Six");
        if (!containsKeySix) {
            hashMap.put("Six", 6);}

        // solution2
        hashMap.putIfAbsent("Six", 6);
        System.out.println(hashMap);

        // Solution 3 - not recommended
        Integer value = hashMap.get("Six");
        if (value == null) {
            hashMap.put("Six", 6);}

        //2
        if (hashMap.containsKey("Three"))
        hashMap.put("Three", 33);

    }
}