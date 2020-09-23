package day52_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {
        // however call the method will be responsable for handling the method


       // method1();  //  compile error because we use THROW Keyword
          method2();  // it was actually fixed! so no compile error when we called it
      //  method3();  //  compile error Because we use THROW keyword


        Thread.sleep(4000);
        Thread.sleep(5000);
        Thread.sleep(6000);


    }




    // by using THROW it handle exception TEMPORARY
    //throw just runAway it DOESNT fix it
    public static void method1() throws InterruptedException{
        Thread.sleep(3000); // check exception
    }


    public static void method2(){
        // try and Catch ONLY! FIX it! Handle the exception PERMANENTLY
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

    }


    public static void method3() throws InterruptedException{
        method1();
    }



}
