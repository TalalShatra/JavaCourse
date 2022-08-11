package Day38_OOP_Polymorphism.HomeWork;

public class Animal {
    void run(){}
    void makeSound(){}

    void run(int meters){
        System.out.println("Animal runs "+ meters+" meters");
    }
    void run(int units, String unit){
        System.out.println("Animal runs " +units+" "+unit);
    }

}
