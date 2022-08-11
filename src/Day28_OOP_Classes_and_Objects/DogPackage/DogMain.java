package Day28_OOP_Classes_and_Objects.DogPackage;

public class DogMain {
    public static void main(String[] args) {

        Dog lucy = new Dog(); // Create a new Dog object
        lucy.breed = "Neapolitan Mastiff"; // initializing breed property for lucy object
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";

        System.out.println("Lucy's breed: " + lucy.breed);
        System.out.println("Lucy's age: " + lucy.age);

        lucy.eat();

        lucy.sleep();
        System.out.println("Lucy is sleeping: " + lucy.isSleeping);
        lucy.snoring();

        lucy.wakeUp();
        System.out.println("Lucy is sleeping after wake up method: " + lucy.isSleeping);
        lucy.snoring();



        // ************************************************ //

        Dog max = new Dog();
        max.breed = "Maltese";
        max.size = "Small";
        max.age = 2;
        max.color = "White";

        System.out.println("Max's breed: " + max.breed);
        System.out.println("Max's color: " + max.color);

        max.sleep();
        System.out.println(max.isSleeping);

        max.wakeUp();
        System.out.println(max.isSleeping);

        // ************************************************ //

        Dog cooper = new Dog();
        cooper.breed = "Chow Chow";
        cooper.size = "Medium";
        cooper.age = 3;
        cooper.color = "Brown";

        System.out.println("cooper's breed: " + cooper.breed);
        System.out.println("cooper's size: " + cooper.size);

        cooper.sleep();
        //or >>>> cooper.isSleeping = true;
        System.out.println(cooper.isSleeping);

        cooper.wakeUp();
        System.out.println(cooper.isSleeping);

    }

}
