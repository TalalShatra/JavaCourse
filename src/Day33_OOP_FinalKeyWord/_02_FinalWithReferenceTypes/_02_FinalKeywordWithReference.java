package Day33_OOP_FinalKeyWord._02_FinalWithReferenceTypes;

import java.util.Arrays;

public class _02_FinalKeywordWithReference {

    public static void main(String[] args) {

        // When we declare an array as final the size of the array is final we cannot instantiate it - but we can update values inside array!
        final String[] months = new String[4];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";

        System.out.println(Arrays.toString(months));

        months[0] = "Hey";

        System.out.println(Arrays.toString(months));


        //But we still can declare another array with different name
        String[] year = new String[5];
        year[0] = "2022";
        System.out.println(Arrays.toString(year));

    }

}
