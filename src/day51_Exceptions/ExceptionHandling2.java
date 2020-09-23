package day51_Exceptions;
// any class from java.lang package is implicity imported// automatic imported
public class ExceptionHandling2 {

    public static void main(String[] args) {


        String exceptionResult = ""; // to know why and printed in my report when testing!

        try {  // now exception is gone we wont see it,
            System.out.println(10 / 0); // exception
        }catch(ArithmeticException e){  // catch(?) need to WRITE the ClassName!
            exceptionResult =  e.getMessage();
            System.out.println("ArithmeticException is detected");
        }

        System.out.println(exceptionResult);



    }
}
