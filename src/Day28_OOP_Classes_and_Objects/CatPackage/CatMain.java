package Day28_OOP_Classes_and_Objects.CatPackage;
       //2-Create 2 objects of this class,
       // set their properties and call their methods
       // Part 2
       // Create a method in Cat class to print cat properties
public class CatMain {
              public static void main(String[] args) {

                     Cat flafy = new Cat();

                     flafy.color = "white";
                     System.out.println("flfy's color is " +flafy.color);
                     flafy.age = 2;
                     System.out.println("flafy's age is " +flafy.age);

                     flafy.sound();

                     flafy.properties();
              }

}
