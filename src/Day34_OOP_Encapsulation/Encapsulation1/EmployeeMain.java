package Day34_OOP_Encapsulation.Encapsulation1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack", 111111);

        employee.setBaseSalary(90_000);
        employee.setHourlyRate(55);

        System.out.println(employee.getName());
        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());

        int wage = employee.calculateWage(40);
        System.out.println("Wage: " + wage);

        // (employee.BaseSalary) not work - no direct access (private)



        /**
         EMPLOYEE EXAMPLE WITHOUT ENCAPSULATION
         Employee employee = new Employee("Jack", 11111111);
         employee.baseSalary = -100;
         employee.hourlyRate = -55;
         System.out.println(employee.SSN)
         */
    }
}
