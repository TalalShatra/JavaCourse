package Day37_OOP_Override.HumanTask;

public class Woman extends Human {

    public Woman(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void isSleeping() {
        System.out.println("Woman is dreaming");
    }
    @Override
    public void isEating() {
        System.out.println("Woman is eating and feeding her Baby");
    }
}
