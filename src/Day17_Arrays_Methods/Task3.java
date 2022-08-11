package Day17_Arrays_Methods;

public class Task3 {
    public static void main(String[] args) {

        //    {"apple", "watermelon", "peach", "strawberry", "kiwi"}
        //print this array in reverse order (using for loop)

       String[] fruits = {"apple", "watermelon", "peach", "strawberry", "kiwi"};

       for (int i = fruits.length-1; i>=0; i--){
   //  for (int i < fruits.length; i = 0; i--)
   //  second for loop does not work
   // that mean first condition in for loop should be equal always??
   // and second condition should contain < or > ??

           System.out.println(fruits[i]);
       }

        }

    }