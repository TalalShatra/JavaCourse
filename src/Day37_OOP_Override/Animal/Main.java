package Day37_OOP_Override.Animal;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Arya";
        cat.age = 2;

        cat.eat();
        cat.sleep();



        Dog dog = new Dog();
        dog.name = "Max";

        dog.eat();
        dog.sleep();

    }

}
