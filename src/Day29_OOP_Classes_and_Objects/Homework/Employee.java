package Day29_OOP_Classes_and_Objects.Homework;

public class Employee {
    //Part 1-
    //  - Create a class called Employee with following fields and methods:
    //        a) name (field)
    //        b) title (field)
    //        c) ssn (field)
    //        d) printProperties (method)

    String employeeName, title;
    int ssn;

    void printProperties() {
        System.out.println("Name: " + employeeName);
        System.out.println("Title: " + title);
        System.out.println("SSN: " + ssn);
    }
}
