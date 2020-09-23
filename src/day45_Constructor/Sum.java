package day45_Constructor;

public class Sum {

    // using overloading we can have more than 1 constructor
    // overloading( different parameters, or datatype)

    public Sum(int a, int b){
        System.out.println(a +" + "+b+" = "+(a+b));
    }

     public Sum(double a, double b){
         System.out.println(a +" + "+b+" = "+(a+b));
     }

    public Sum(int a, int b,int c){
        System.out.println(a+b+c);
    }

    public Sum(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        //Creating an Object // will automatically print since we displayed in the method
        new Sum(10,20);
        new Sum(10.5,20.5);

        new Sum(10.5, 10);
        new Sum((int)10.5, 10); // so both integers so RESULT INT =20

        new Sum(10,20,30);
        new Sum(10.0,20.0,30.0);


    }






}
