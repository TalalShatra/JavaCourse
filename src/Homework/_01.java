package Homework;

import java.lang.invoke.StringConcatException;

public class _01 {
    public static void main(String[] args) {
    //1
        byte firstByte = 5;
        System.out.println(firstByte);
        byte secondByte = -4;
        System.out.println(secondByte);
        byte maxValueOfByte = Byte.MAX_VALUE;
        System.out.println(maxValueOfByte);
        byte minValueOfByte = Byte.MIN_VALUE;
        System.out.println(minValueOfByte);

    //2
        short firstShort = 220;
        System.out.println(firstShort);
        short secondShort = -109;
        System.out.println(secondShort);
        short maxValueOfShort = Short.MAX_VALUE;
        System.out.println(maxValueOfShort);
        short minValueOfShort = Short.MIN_VALUE;
        System.out.println(minValueOfShort);

    //3
        int firstInteger = 19375;
        System.out.println(firstInteger);
        int secondInteger = -987666;
        System.out.println(secondInteger);
        int maxValueOfInteger = Integer.MAX_VALUE;
        System.out.println(maxValueOfInteger);
        int minValueOfInteger = Integer.MIN_VALUE;
        System.out.println(minValueOfInteger);

    //4
        long firstLong = 94929375;
        System.out.println(firstLong);
        long secondLong = -43287666;
        System.out.println(secondLong);
        long thirdLong = 99999999;
        System.out.println(thirdLong);
        long fourthLong = -789321654;
        System.out.println(fourthLong);

    //5
        float firstFloat = 121.005f;
        System.out.println(firstFloat);
        float secondFloat = -123.3365f;
        System.out.println(secondFloat);
        float thirdFloat = 3.55f;
        System.out.println(thirdFloat);
        float fourthFloat = -88f;
        System.out.println(fourthFloat);

    //6
        double firstDouble = 98.83832;
        System.out.println(firstDouble);
        double secondDouble = -3.334;
        System.out.println(secondDouble);
        double thirdDouble = 520.4;
        System.out.println(thirdDouble);
        double fourthDouble = -6;
        System.out.println(fourthDouble);

    //7
        char firstChar = 'a';
        System.out.println(firstChar);
        char secondChar = 'A';
        System.out.println(secondChar);
        char thirdChar = '&';
        System.out.println(thirdChar);
        char fourthChar = '1';
        System.out.println(fourthChar);
        char symbol1 = '\'';
        System.out.println(symbol1);
        char symbol2 = '\\';
        System.out.println(symbol2);

    //8
        boolean firstBoolean = true;
        System.out.println(firstBoolean);
        boolean secondBoolean = false;
        System.out.println(secondBoolean);

    //9
        String firstString = "laptop";
        System.out.println(firstString);
        String secondString = "water";
        System.out.println(secondString);
        String thirdString = "I'm taking" +" " + "\"SDET\"" +" " + "Course";
        System.out.println(thirdString);
        String fourthString = "[technostudy]" + "(https://technostudy.coassemble.com/student/course/34535#/)";
        System.out.println(fourthString);

    //10
        String xString = "I love java!";
        int lengthOfXString = xString.length();
        System.out.println(lengthOfXString);

        String yString = "Sprint planning";
        int lengthOfYString = yString.length();
        System.out.println(lengthOfYString);

        String zString = "paper";
        String newZString = zString.toUpperCase();
        System.out.println(newZString);

        String qString = "OraNge";
        String newQString = qString.toLowerCase();
        System.out.println(newQString);

        String wString = "New Jersey";
        String newWString = wString.toUpperCase();
        System.out.println(newWString);

        String eString = "New York";
        String newEString = eString.toLowerCase();
        System.out.println(newEString);

        String message = "apple";
        boolean newMessage =message. contains("app");
        System.out.println(newMessage);

        String message2 = "Florida";
        int newMessage2 = message2.indexOf('o');
        System.out.println(newMessage2);

        String message3 = "Thank You";
        int newMessage3 = message3.indexOf('Y');
        System.out.println(newMessage3);

        String message4 = "Friend";
        char newMessage4 = message4.charAt(3);
        System.out.println(newMessage4);

    //11
        String x1 = "TechnoStudy SDET Course!";
        boolean newX1 = x1.startsWith("T");
        System.out.println(newX1);

        String x2 = "I love java!";
        boolean newX2 = x2.endsWith("java!");
        System.out.println(newX2);

        String x3 = "      There are 8 primitive data types in Java!         ";
        String newX3 = x3.trim();
        System.out.println(newX3);

        String x4 = "My bank account number is 0987654323456789 and my rooting number is 48883280129.";
        String newX4 = x4.replaceAll("[0-9]", "*");
        System.out.println(newX4);

        String x5 = "Pracicing Java is really important!";
        String newX5 = x5.replaceAll("a", "@");
        System.out.println(newX5);

        String x6 = "     ";
        boolean newX6 = x6.isEmpty();
        System.out.println(newX6);

        String x7 = "HEY!";
        String x8 = "hey!";
        System.out.println(x7.equals(x8));
        String newX8 = x8.toUpperCase();
        System.out.println(x7.equals(newX8));

        String x9 = "We are going to be Software Testers in 6 months!";
        String newX9 = x9.substring(19,34);
        System.out.println(newX9);

        String y1 = "123456789";
        String y2 = "0987654321";
        String y12 = y1.concat(y2);
        System.out.println(y12);















    }
}
