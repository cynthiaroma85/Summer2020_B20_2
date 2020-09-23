package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class Employee {  // Superclass cannot be final

    public String name;
    final public char gender;  // final keyword we MUST INITIALIZE it right away!
    final public LocalDate DofB; // constant, cannot be changed
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate dofB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DofB = dofB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name=" + name  + ", gender=" + gender + ", DofB=" + DofB +
                ", jobTitle='" + jobTitle  + ", salary: $" + salary ;
    }




}
