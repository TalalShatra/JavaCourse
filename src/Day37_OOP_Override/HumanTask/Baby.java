package Day37_OOP_Override.HumanTask;

public class Baby extends Human {

    public Baby(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void isSleeping() {
        System.out.println("Baby is crying");
    }
    @Override
    public void isEating() {
        System.out.println("Baby is drinking Milk");
    }
}
