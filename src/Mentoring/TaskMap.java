package Mentoring;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class TaskMap {

    //Create a HashMap where the user has an accountNumber as a key and an email address as a value
    //Ex: 123456, "info@techno.study"
    //Create a couple of users and ask the user using Scanner class for an account number
    //Find the account and print "here's your email address: info@techno.study"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> userList = new HashMap<>();

        userList.put(1234, "david@gmail.com");
        userList.put(1235, "angel@gmail.com");
        userList.put(1236, "obsi@gmail.com");
        userList.put(1237, "techno@gmail.com");

        System.out.println("please enter an account number: ");
        int accountId = input.nextInt();

        System.out.println("your email is : " + userList.get(accountId));

        //For a second task print all your data in an increasing ordered version
        //EX: { 123 = "david@gmail.com", 124 = "angela@gmail.com", 125 = "diego@gmail.com" }
        //NOTE: do not change your original Map, your original map should stay as a HashMap


        TreeMap<Integer, String> orderedUserList = new TreeMap<>();

        orderedUserList.putAll(userList);

        System.out.println(orderedUserList);
    }
}
