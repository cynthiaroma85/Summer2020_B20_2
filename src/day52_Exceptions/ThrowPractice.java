package day52_Exceptions;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {

        String driverName ="Chrome";

        if (driverName.equals("Chrome" )){
            System.out.println("set up chrome");
        }else if (driverName.equals("firefox")){
            System.out.println("set up firefox");
        }else if (driverName.equals("opera")){
            System.out.println("set up opera");
        }else{
            throw  new RuntimeException("Invalid Browser Name");
            // RUNTIME for all UNCHECKED future exceptions!
            // mopst likely used throw manually!
        }


        System.out.println("====================");

        if (LocalTime.now().getMinute() == 55 ){
            throw  new RuntimeException("Its break time");
        }else{
            System.out.println("continue");
        }



      //   throw new ArithmeticException();
      // throw new RuntimeException();
         // no code will be executed after throw keyword



    }


}
