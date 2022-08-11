package Day21_METHODS__Varargs;

public class Task2_Varargs {

    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        System.out.println(multiply(1.5, 2.4, 8.9, 7.6));

    }
    public static double multiply(double... varargs) {
        double multi = 1;
        for (int i = 0; i < varargs.length; i++)
            multi *= varargs[i];

        return multi;
    }
}
