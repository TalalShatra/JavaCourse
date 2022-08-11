package Day37_OOP_Override.HumanTask;
/*
Task (Overriding)

Create a class called "Human" with some fields and methods
    - Create another class called Baby which extends Human class
            (override methods from parent)
    - Create another class called Grown(Man-Woman) which extends Human class
            (override methods from parent)
 */

public class Human {
    String name, gender;
    int age;

    public Human(String name,String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void isSleeping() {}

    public void isEating() {}
}
