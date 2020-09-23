package day47_Encapsultion;

public class Constructor {

   // always there is one constructor created by the class by default UNLESS we create One
    // constructor call must always be FIRST
    // constructor doesn't have RETURN type " no void"

    static{
        System.out.println("static block");
    }
public Constructor(){
    System.out.println("Default");
}
    public Constructor(int a){
     //   this(10.0); //because double contains int, CANNOT call ITSELF
        System.out.println("int arg");
    }

    public Constructor(double a){
        this(10);  //int arg
        // this("A"); // CANNOT call more than 1 Costructor
        System.out.println("double arg");  // double arg
    }

    public Constructor(String a){

        this(5.5); // int, double
        System.out.println("String arg"); // string
    }

    public void Constructor(){ // this is not Constructor since have a RETURN Type!!!

    }


    public static void main(String[] args) {

        //new Constructor();

        new Constructor("A");


    }



}




