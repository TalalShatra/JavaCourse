package Day35_OOP_Inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchFly() {
        System.out.println("Cat is catching fly!");
    }

}
