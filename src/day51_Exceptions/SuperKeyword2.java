package day51_Exceptions;

class B{

    public B(){
        System.out.println("Super class' default constructor");
    }
}

public class SuperKeyword2 extends B{

    // CONSTRuctor, can never be INHERITANCE , but its mandatory to
    // This constructor will be call through object

    public SuperKeyword2(){
        //  super();  // call the super class' constructor, ALso have to be FIRST STEP!
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();  //Super class' default constructor
                              // Sub class' default constructor

        // in the inhertance its mandatory to call the superClass constructor
        // and only one constructor can call another constructor
        // its the parameter constructor is DEFAULT then its automatically called IMPLICITY
        // SuperCLass constructor will be called first

    }



}
