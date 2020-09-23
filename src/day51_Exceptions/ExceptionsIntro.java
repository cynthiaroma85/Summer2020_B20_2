package day51_Exceptions;

public class ExceptionsIntro {


    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("Test started");//it will still running the code UNTIL unchecked excep
                                // but then we will get the compile error

       // System.out.println(arr[100]); // unchecked exceptions (unexpected event)
        // because it occur during RUNTIME
          // no compile error while  writing the code But we SEE IT when Running the code

        // Thread.sleep(3000);  // checked exception (unwanted event)
                        // When i see the compile error right away because of the exception


        String str = "Cybertek";


        System.out.println( str.charAt(-1));  // unchecked
        System.out.println("Step 2");



    }


}
