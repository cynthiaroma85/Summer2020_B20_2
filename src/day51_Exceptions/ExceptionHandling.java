package day51_Exceptions;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // empty
    //System.out.println(list.get(1)); // its empty=======
        // unchecked exception , because array its empty
        // Without HANDELING i CANNOT go to the next step

        String exceptionMessage = "";
        // to get the exception message outside in order to documented// or in my report

        try {
            System.out.println(list.get(1)); // to handle exception

        }catch (IndexOutOfBoundsException e){
            exceptionMessage =  e.getMessage() ;  // get message and return String
        }


        System.out.println("next step");

        System.out.println(exceptionMessage);



    }
}
