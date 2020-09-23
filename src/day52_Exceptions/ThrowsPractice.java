package day52_Exceptions;

public class ThrowsPractice {

    public static void main(String[] args) throws InterruptedException {
        m1();
        m2();
    }

    // disadvantage of THROW; CALLER will have a problem
    // Advantage it handle Temporary and its more READable
    // only used it if the method wotn be called in the future!

    public static void m1()throws InterruptedException{
        Thread.sleep(3000);
    }


    public static void m2() throws InterruptedException{
        m1();
    }

// try and catch will fixed the exception permanently
    public static void m3(){
        try {
            m2();
        }catch (InterruptedException e){
        }
    }


    public static void m4(){
        m3();  // no compile error because it was fixed with try catch
    }





}
