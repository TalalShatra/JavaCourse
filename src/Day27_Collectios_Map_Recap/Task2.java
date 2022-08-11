package Day27_Collectios_Map_Recap;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]

        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

        ArrayList<String> devTeam = new ArrayList<>();
        Collections.addAll(devTeam, "Talal", "Ozan");

        ArrayList<String> qaTeam = new ArrayList<>();
        Collections.addAll(qaTeam, "KH", "OK", "No");

        groupsAndMembers.put("Development Team", devTeam);
        groupsAndMembers.put("Qa Team", qaTeam);

        System.out.println(groupsAndMembers);

        // ****************** PART 2 ******************

        // Collections: is a parent class of all collection types(arraylist, set...)
        // Collection: is a data type like List

        // Solution 1
        Collection<ArrayList<String>> values = groupsAndMembers.values();
        for (ArrayList<String> list : values){
            System.out.println(list.size());}
       // did we get in 1 solution with this method a collection of 2 ArrayLists as Strings?

        // Solution 2
        Set<String> keys = groupsAndMembers.keySet();
        for (String key : keys) {
            ArrayList<String> group = groupsAndMembers.get(key);
            System.out.println("Number of members in: " + key + " " + group.size());
        }


    }
}
