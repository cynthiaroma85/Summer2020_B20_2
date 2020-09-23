package day21_Loops;

public class DoWhile {
    public static void main(String[] args) {


        boolean result = false;

        while(result){
            System.out.println("Hello World");
        }

        System.out.println("===============================");

        do{ // just do it      // if both TRUE statement get executed infinite times
            System.out.println("Hello World");  // if FALSE only executed 1 TIME
        }while(result);





    }
}
