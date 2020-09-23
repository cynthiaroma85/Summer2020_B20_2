package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

// if super class have a CONSTRUCTOR we MUST call it manually ( ALso argument if have it )
// "final" after access modifier preferred. ALso to be final class
public final class Tester extends Employee{

    public Tester (String name, char gender, LocalDate dofB, String jobTitle, double salary){
       super(name, gender, dofB, jobTitle,  salary); // to call constructor from Super Class
    }

    // sice this class is final, all atributes and methods wont be inhereted anymore
    public void findBug(){
        System.out.println(name+" found a bug!");
    }

}
