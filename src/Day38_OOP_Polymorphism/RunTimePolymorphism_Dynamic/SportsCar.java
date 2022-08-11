package Day38_OOP_Polymorphism.RunTimePolymorphism_Dynamic;

public class SportsCar extends Vehicle{

    @Override
    void speedUpTo60mph() {
        System.out.println("Sports Car speed up to 60 mph in 3 seconds!");
    }
}
