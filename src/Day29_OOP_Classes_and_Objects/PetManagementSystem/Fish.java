package Day29_OOP_Classes_and_Objects.PetManagementSystem;

import java.util.Arrays;

public class Fish {
    String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner owner;

    void printProperties() {
        System.out.println("color: " + color);
        System.out.println("age: " + age);
        System.out.println("Type: " + type);
        System.out.println("List of Need: "+ Arrays.toString(listOfNeeds));}
}
