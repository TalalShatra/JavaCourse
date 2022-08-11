package Day35_OOP_Inheritance;

// Dog class is a child class of Animal class
    public class Dog extends Animal {

        public Dog(String name, int age) {
            super(name, age);
        }

        public void lickPerson() {
            System.out.println("Dog is licking a person!");
        }

    }
