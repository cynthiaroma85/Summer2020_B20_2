package day19_forLoop;

public class OddEven2 {
    public static void main(String[] args) {

        // print even number 1 to 50
        for( int i=1; i<=50;i++){

            if (i%2!=0){
                continue; // if number its ODD will skip
                          // so will print only even numbers
            }
            System.out.print(i+" ");
        }


        System.out.println();

        // print ODD number 1 to 50
        for( int i=1; i<=50;i++){

            if (i%2==0){
                continue; // if number is even it will skip
                // so only ODD numbers will print
            }
            System.out.print(i+" ");
        }










    }
}
