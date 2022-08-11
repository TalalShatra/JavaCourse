package Day29_OOP_Classes_and_Objects.Homework;

public class Main {
    //Part 3-
    //  Create main class and create new Company objects and initialize all the properties and print them all!
    //  Note: When you're initializing employee use hireEmployee and fireEmployee methods do not initialize manually!!!

    public static void main(String[] args) {

        Company amazon = new Company();
        amazon.companyName = "Amazon";
        amazon.companyField = "e-commerce";
        amazon.ownerOfCompany = "Jeff Bezos";
        amazon.yearCompanyFounded = 1994;


        amazon.hireEmployee("John", "QA Engineer", 123456789);

        amazon.printProperties();

        amazon.fireEmployee();

        amazon.printProperties();

    }
}
