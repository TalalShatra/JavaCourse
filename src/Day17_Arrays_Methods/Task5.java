package Day17_Arrays_Methods;

public class Task5 {
    public static void main(String[] args) {
        // PART 1
        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements

        // PART 2
        // make a copy of that array (by values)

        String[] veggies = {"tomato", "garlic", "potato", "onion"};
        for (int i = 0; i < veggies.length; i++)
            System.out.println(veggies[i]);

        // PART 2

        String[] copy = new String[veggies.length];

        for (int i = 0; i < veggies.length; i++)
            copy[i] = veggies[i];

        // To Print
        for (int i = 0; i < copy.length; i++)
            System.out.println(copy[i]);



    }
}
