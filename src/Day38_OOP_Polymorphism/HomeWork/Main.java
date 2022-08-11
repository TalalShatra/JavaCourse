package Day38_OOP_Polymorphism.HomeWork;

public class Main {
    /*
    POLYMORPHISM TASK (run time - compile time)

- Create a class called Animal
    * create methods called run(), makeSound() in Animal class

- Create subclasses of Animal: Cat, Dog, Horse
    * override makeSound() in subclasses

---------------------------------------------------------------

- In Animal class (Overload run method)
    * run(int meters) method -> prints something like: Animal runs 4 meters
    * run(int units, String unit) method -> prints something like: Animal runs 2 units(kilometer, mile...)

---------------------------------------------------------------

- Create Main class
    * create objects (Animal animal1 = new Cat(); - Animal animal2 = new Dog(); ....)
    * call the run() and makeSound() method for each object
     */
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Horse();

        animal1.run(1,"mile");  // Compile Time Polymorphism
        animal2.run(2,"miles");
        animal3.run(3,"miles");

        animal1.makeSound();  // RunTime polymorphism
        animal2.makeSound();
        animal3.makeSound();
    }
}
