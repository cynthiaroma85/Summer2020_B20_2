package day48_Inheritance;

class A{  // only one super class
    static int a=10;
}

class B extends A{  // B inhert A so: (a and b)
    static int b=20;

}


class C extends B{ // c inherts from B so: ( a,b, and now c )
    static int c=30;

}



public class Inheritance1 {
}
