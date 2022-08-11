package Day4.TypeCasting;

public class ExplicitCasting {

    // Explicit Casting - Narrowing Casting (Manual)

    public static void main(String[] args) {

        long myLong = 284563L;
        int myInteger = (int) myLong;

        int myInteger2 = 5000;
        short myShort = (short) myInteger2;

        short myShort2 = 54;
        byte myByte = (byte) myShort2;

        double myDouble = 3.123;
        float myFloat = (float) myDouble;


        double myDouble2 = 45.36;    // Data lose
        int myInteger3 = (int) myDouble2;
        System.out.println(myInteger3);

        short shortNumber = 129;
        byte byteNumber = (byte) shortNumber;
        /* out of byte range will overflow on other side
         will print -127
         */












    }
}
