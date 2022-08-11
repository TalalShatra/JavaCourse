package Homework.ReturnTypes;
import java.util.Arrays;
public class Void {


    public static void main(String[] args) {

        int[] randomValues = new int[5];
        for (int i = 0; i < randomValues.length; i++)
            randomValues[i] = (int) (Math.random() * 9) + 1;

        PrintArray(randomValues);
        sumArray(randomValues);
        printMaxArray(randomValues);
    }

    //1
    public static void PrintArray (int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        }

    //2
    public static void sumArray(int[] arraySum){
        int sum =0;
        for (int i = 0; i < arraySum.length; i++){
            sum += arraySum[i];
            System.out.println(sum);}
        }

    //3
    public static void printMaxArray(int[] arrayMax){
        Arrays.sort(arrayMax);
        System.out.println(arrayMax[(arrayMax.length) -1]);}
    // int maxValue = arrayMax[0];
    // for (int i = 1; i < arrayMax.length; i++){
    // if (arrayMax[i] > maxValue)
    // maxValue = arrayMax[i];
}