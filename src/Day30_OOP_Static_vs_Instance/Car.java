package Day30_OOP_Static_vs_Instance;

public class Car {
    /**
     Instance Members (Fields and Methods)
     - instance members belongs to objects
     - to access instance members we need to create an object
     - for each object 1 copy (of each instance variable) will be created
     */

    String make;
    String model;
    int year;

    void buyCar() {
        numberOfCarsInInventory++;
    }


    /**
     Static Members
     - static members belongs to class itself
     - to access static fields we need to call with class name
     - there will be only 1 copy for static variables

     */

    static int numberOfCarsInInventory = 0;

    static void printNumberOfCars() {
        System.out.println(numberOfCarsInInventory);
    }
//public: means that the method is visible and can be called from other objects of other types. Other alternatives are private, protected, package and package-private.
 //static:  means that the method is associated with the class, not a specific instance (object) of that class. This means that you can call a static method without creating an object of the class.
 //void: means that the method has no return value. If the method returned an int you would write int instead of void.

/*
Instance method vs Static method

Instance method can access the instance methods and instance variables directly.
Instance method can access static variables and static methods directly.
Static methods can access the static variables and static methods directly.
Static methods can’t access instance methods and instance variables directly.
 They must use reference to object. And static method can’t use this keyword
  as there is no instance for ‘this’ to refer to.
 */
}
