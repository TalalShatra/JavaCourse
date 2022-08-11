package Homework.WhileLoop;

public class Homework4 {
    public static void main(String[] args) {
       // 4- Sum all the odd numbers from 1 to 100 (1 + 3 + 5 ....)
        //Use While Loop!

        int counter = 1;
        int total = 0;


        while (counter < 100) {
            total = total + counter;
            counter +=2;

        }
        System.out.println(total);
    }
}
