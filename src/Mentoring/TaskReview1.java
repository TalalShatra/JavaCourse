package Mentoring;
import java.util.ArrayList;
public class TaskReview1 {

    public static void main(String[] args) {

//1 , 2 , 3 , 4
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        System.out.println(list);

        list.set(list.size() - 1, 3);

        System.out.println(list);

        System.out.println(list.isEmpty());

        Integer number1 = 1;

        list.remove(number1);

        System.out.println(list);

        list.add(4);
        list.add(0);
        list.add(5);
        list.add(4);
        list.add(9);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }

        list.clear();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.println("\n"+list);

    }
}
