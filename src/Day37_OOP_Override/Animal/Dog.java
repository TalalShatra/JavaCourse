package Day37_OOP_Override.Animal;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println(name + " is eating Meat");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is snoring");
    }
}
