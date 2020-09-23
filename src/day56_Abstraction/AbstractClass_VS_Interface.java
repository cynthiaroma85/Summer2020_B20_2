package day56_Abstraction;

//INHERITANCE built relationship to increase reusability
// for logging user name and password we can use inheritance
// ABSTRACTION:



public abstract class AbstractClass_VS_Interface {

    private int a;
    protected static int b;

    public void method1(){ }
    public static void method2(){ }
    public abstract void method3();  // only way to declare abtract method by using Abstract KEYWORD
    public AbstractClass_VS_Interface(int a){ // constructor
        this.a=a;
    }

    static { b=300; }  // static block

    {  // instance block
        a= 3000;
    }


    public static void main(String[] args) {
     //   Math.PI=100;  static and final
    }

}



interface A{

    int a =10;  // public static final     by default

   // public void method1(){}  // Interface NOT accept instance methods

    //public static void method2(){}
              static void method2(){}  // no need keyword of Interface also by default PUBLIC

    abstract void method3();
              void method3_2(int b);  // public abstract
             // abstract method is the only recommendation in interface

    default void method4(){} // public    by default

   // public A(){}   //No constructor in interface

    //static {} // NO static block

    //{}

}