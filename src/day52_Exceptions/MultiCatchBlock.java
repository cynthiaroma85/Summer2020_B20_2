package day52_Exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        try {
            System.out.println(arr[20]); // ArrayIndexOutOfBound

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is handled");

        }catch(ClassCastException e){
            System.out.println("Class Cast Exception");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bound Exception");

        }catch (RuntimeException e){
            System.out.println("Run Time Exception");

        } // catch(NoSuchElementException e){ }
        //exception code place it at  the catch block
        // will only print the FIRST catch that can HANDLE


        System.out.println("=====================================");

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch(RuntimeException e){  // runtimeexception can handle any unchecked exception
            System.out.println(e.getMessage());
        }

        System.out.println("=====================================");
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("=====================================");

        try {
            System.out.println(8/0);
            System.out.println("Try Block"); // Arithmetic exception
        }catch (ArrayIndexOutOfBoundsException e){  // this exception doesnt handle
            System.out.println("Catch Block"); // so if not handled then Not printed this one
        }finally {
            System.out.println("Finally Block");//always get executed, even if exception isnot Handled
        }




        System.out.println("Completed");



    }


}
