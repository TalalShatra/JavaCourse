package Day37_OOP_Override.HumanTask;

public class Main {
    public static void main(String[] args) {

        Baby baby1 = new Baby("Sam", "Male", 1);
        baby1.isEating();
        baby1.isSleeping();

        Woman woman1 = new Woman("Katie", "Female", 34);
        woman1.isEating();
        woman1.isSleeping();
    }
}
