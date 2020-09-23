package day47_Encapsultion;

public class AccessModifiers {

// public
    public static int  publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }

    // default
    static int defaultVariable=200;

    static void defaultMethod(){
        System.out.println("default method");
    }


    //private :only use/visible between the same class
    // static so it can be call between the class// or static method
    private static int privateVariable=300;
    private static void privateMethod(){
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        System.out.println(defaultVariable);
        System.out.println(publicVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMethod();
        privateMethod();


    }




}
