package day56_Abstraction;

// interface for achieving Abstraction ONLY!
// Interface, VARIABLES: public static and final (by default)
// Interface Method; static method, abstract method, and default method
//       its Abstract, so need to be visible to be implemented ( by default ,its public)
//       Use ONLY Abstract method, ( also can have static and default method)
//       pure abstraction, so methods need to be override
//       can implement multiples methods at the sametime
//

public interface InterfacePractice {  // interface

                        int a = 200; //interface make Variable by default public, static, and final.
    public static final int b =300;

    public static void method1(){  // static method ONLY accept static variables
        System.out.println(a);
        System.out.println(b);
        // a = 100;  // since interface its final cannot be reassigned
        //  b = 30;
    } // static method

   // public static void main(String[] args) {
             static void main(String[] args) {}   // by default its public


    //public default void method2(){   // default method its also allowed on INTERFAce
             default void method2(){ }

 // public void method3(){ }  // no instance method on interface

    //public InterfacePractice(){ }  // no Constructor

    public abstract void method4();  //abstract method INFINITE! but will need to be override
                                    // abstract KEYWORD is not mandatory
                    void method5();  // abstract method

  //  static { }  // not static block ! because the variable by default its public static and FINAL
                 // so it can not be reassigned

//  { }  // instance block

    // instance variables



}
