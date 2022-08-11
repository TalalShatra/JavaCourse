package Day34_OOP_Encapsulation.Task1;

public class Student {
   /* Create a class called Student with following private fields
    - Name (Read-only) - you should initialize this field with constructor
    - Age (Both Read and Write)
    - Country (Both Read and Write)
    - Grade (Both Read and Write)
    */

    private String name,country;
    private int age, grade;

    public Student(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
