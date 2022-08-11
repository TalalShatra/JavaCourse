package JavaInterviewQuestion;

public class Main {
    //Q-1 What does it mean that "Java is Platform Independent" ?
    //Answer : When we write our code in MAC then We can easily run in Windows.
    //Creating the code in a different Operating Systems and running in another OS.

    //Q-2 What does Java IDE mean ?
    //Answer : Integrated Development Environment , there are two main IDEs. One is IntelliJ and other Eclipse

    //Q-3 Can you define Constructor ?
    //It is necessary to create an object,
    // It is must to have the same name with Class.
    // Constructors can be overloaded but not overriden

    //Q-4 What does OOP Concept mean ?
    //Anser : 4 main points under OOP concept
    //1- Enharitance
    //2- Polymophism
    //3- Apstraction
    //4- Encapsulation

    //Q-5 WHat does Overloading mean ?
    //Answer : We use the same method with the same name but parameter must be different.
    //Static is Overloading and Dynamic is Overriding
    //Overloading is Compile Time Polymorphism and Overriding is Run Time Polymorphism
    // substring(4) , substring(4,7)

    //Q-6 What does Overriding mean?
    //It is known as Dynamic or Run Time Polymorphism
    //Overloading is done in the same classe but Overriding is done in different classes
    //Having the same method with the exactly same name and same parameter(same signature) but in different classes
    //There must be a parent child relationship between in these classes.(inheritance)
    //When we do mistakes while compiling overriding we can not see at the time of compiling.
    //That is why only see the error at the time of running.


    //Q-7 What are the differences between Array and ArrayList?
    //Answers : Array has fixed length but ArrayList is resizable.
    //That is why when we creat Array, we have to declare the number of elements
    //But when we create ArrayList we don't need to declare the number of elements. We may add or delete later
    //We can store both primitives and References (Objects) in Array but we have to store only Ojecets in ArrayList.
    //We can store those primitive data by in ArrayList by using WrapperClasses.

    //Q-8 Can you define Access Modifiers and the types?
    //Answers : There are 4 types of Access Modifiers (Public, Protected, Default , Private)
    // Puplic : Access from everwhere (from any classes)
    // Protected : Access from same package or from child classes
    //Default : Access from only same package
    //Private : Access from only same class

    //Q-9 Tell me about Pre-Increment and Post-Increment?
    //Answer : count++; (post-increment) --> first return then increment by 1
    //         ++count; (pre-increment)  --> first increment by 1 then return
}
