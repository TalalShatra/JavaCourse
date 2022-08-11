package Day29_OOP_Classes_and_Objects.Homework;

public class Company {
    //Part 2-
    //  Create a class called Company with following fields and methods:
    //        a) companyName (field)
    //        b) yearCompanyFounded (field)
    //        c) companyField (field)
    //        d) ownerOfCompany (field)
    //        e) employee (field - type of field should be Employee!)
    //
    //        f) hireEmployee (method - when you call this method you're going to initialize employee details - you need to get employee details as parameters)
    //        g) fireEmploye (method - when you call this method you're going to remove employee object <employee object should be null>)
    //        h) printProperties (method - if employee object is not null then this method should print employee information as well)


    String companyName, companyField, ownerOfCompany;
    int yearCompanyFounded;
    Employee employee;

    void hireEmployee(String employeeName, String employeeTitle, int ssn) {
        employee = new Employee();
        employee.employeeName = employeeName;
        employee.title = employeeTitle;
        employee.ssn = ssn;
    }

    void fireEmployee() {
        employee = null;
    }

    void printProperties() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Year " + companyName + " Founded " + yearCompanyFounded);
        System.out.println("Company Field: " + companyField);
        System.out.println("Owner of Company: " + ownerOfCompany);
        if (employee != null)
            employee.printProperties();
    }

    }

