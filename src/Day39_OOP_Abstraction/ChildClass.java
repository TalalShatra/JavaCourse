package Day39_OOP_Abstraction;

public class ChildClass extends AbstractClass {

    // Child class has to implement abstract methods from parent class!

    @Override
    public void abstractMethod() {
        System.out.println("This is the implementation of abstract method!");
    }

}
