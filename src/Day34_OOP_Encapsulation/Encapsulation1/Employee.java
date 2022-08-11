package Day34_OOP_Encapsulation.Encapsulation1;
// Encapsulation
// Bundle all the related data and methods in a single unit!
// Can hide data! (by making fields private)
// Can create public getter(read data - get data) and public setter(updating, initializing or setting data) methods to access private fields!
public class Employee {

    private String name;
    private int ssn, baseSalary, hourlyRate;

    public Employee(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Getter BaseSalary
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter BaseSalary
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary cannot be less than 0!");
        this.baseSalary = baseSalary;
    }

    // Getter HourlyRate
    public int getHourlyRate() {
        return hourlyRate;
    }

    // Setter HourlyRate
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0!");
        this.hourlyRate = hourlyRate;
    }

}
