package day46_ConstructorCalls;

public class Employee {
    String name;
    String jobTitle;
    int ID;
    double salary;

    public Employee(String name) {
        this.name=name;
    }


    public Employee(String name, String jobTitle){
      //  this();// compile error because there is two( the name and default)
        this(name); // sets the name // when also calling another constructor must be FIRST Step
        this.jobTitle=jobTitle;
    }


    public Employee(String name, String jobTitle, int ID){
        // instead using keyword "this. " to set the variable, since 2 are already declared
        this(name, jobTitle); //
        this.ID=ID;
    }


    public Employee(String name, String jobTitle, int ID,double salary){
        this(name, jobTitle,ID);// because we can call only ONE// set name jobtitle and ID!!
        this.salary=salary;
    }


    public String toString() {
        return "Name: " + name +
                "\nJob Title: " + jobTitle +
                "\nID: " + ID+
                "\nSalary: " + salary;
    }






}
