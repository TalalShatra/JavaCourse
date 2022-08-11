package Day35_OOP_Inheritance;
// OOP Inheritance
public class Animal {
    // Animal class is the parent class
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("ZzZzZzZzZzZzZz...");
    }

    public void eat() {
        System.out.println("Nom nom nom...");
    }
}
