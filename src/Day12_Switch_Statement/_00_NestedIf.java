package Day12_Switch_Statement;

public class _00_NestedIf {

    public static void main(String[] args) {

        boolean condition = true;
        boolean anotherCondition = false;


        if (condition) {

            if (anotherCondition) {
                System.out.println("Condition 2 is true!");
            } else {
                System.out.println("Condition 1 is true!");
            }

        } else {
            System.out.println("No condition true!");
        }


    }
}
