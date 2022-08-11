package Day29_OOP_Classes_and_Objects.PetManagementSystem;

public class Owner {

    String name;
    int age;
    String gender;

    void printOwnerInfo(){
        System.out.println("Owner's Name: " + name);
        System.out.println("Owner's Age: " + age);
        System.out.println("Owner's Gender: " + gender);
    }
}
