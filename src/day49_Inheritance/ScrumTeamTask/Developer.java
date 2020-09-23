package day49_Inheritance.ScrumTeamTask;

public class Developer extends Employee {


    // we can create a constructor on the last subclasses
    public Developer(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }


    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBug(){
        System.out.println(name+" is fixing bug ");
    }


}
