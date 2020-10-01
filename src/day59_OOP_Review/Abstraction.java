package day59_OOP_Review;
// hidding implementacion, only method, meant to be OVERRIDEN, meant to be extended
// abstract METHOD, no body
// like any other class: static, instance, constructor ,static block
// abstract CLASS: is not concrete so cannot create object,
//              SUBcLASS MUST implement ALL abstract method from super class

// Interface: its NOT a class! Just especify CERTAIN behavior,
//             Interfcace can be implemented to the SUB class only if NEEDED
// class can Implement multiple INTERFACE, but can only Extend 1 Class
// no object means no INSTANCE ( method or variable, no constructor either)
// by default public static and final on abstract method
// static oly ONE copy for entire objects, instance


interface X{  // cannot be final
    public abstract void method1();
                    void method2();

                    int a = 100;  // in Interface by default is public static, Not  instance
                    static int b = 20; //

    //  static { }
}


abstract  class Y{
    int a;
    static int b;

    public abstract void method1();

    Y(){

    }

    static{

    }

}



public class Abstraction {
    public static void main(String[] args) {
        //     Y obj =new Y();  // because abstract is NOT a class
        //     X obj2 = new X();  // becasue Interface areNOT a class
    }
}