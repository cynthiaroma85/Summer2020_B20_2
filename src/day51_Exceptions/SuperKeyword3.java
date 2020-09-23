package day51_Exceptions;


class C{

    public C(int a){  // its Not DEfaul, it has argument
        System.out.println("Super class' int arg constructor");
    }
}


public class SuperKeyword3 extends C {

    // Since the superClass has a CONSTRUCTOR with parameter
    // it MUST BE CALLED MANUALLY in subCLass constructor // super() (mandatory)
    // Constructor can be called only in another constructor, no other method
    public SuperKeyword3(int a){
        super(100); //
        System.out.println("Sub class' constructor with int arg");

    }


    public static void main(String[] args) {
        new SuperKeyword3(100);

    }



    /*
    public void method(){
        super(300);
    }
    */

}
