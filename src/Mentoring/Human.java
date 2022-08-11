package Mentoring;

class Human {
    String name;
    int age;
    int muscle;

    public void goToGym(int howManyTimes) {
        muscle = muscle + howManyTimes;
    }

    public void printInfo() {
        System.out.println("Your name is: " + this.name + ". You are " + this.age + " years old and you have " + muscle + " much muscle.");
    }

}
