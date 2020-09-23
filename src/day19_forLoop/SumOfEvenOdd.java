package day19_forLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        // Taks:03:
        // 0 2 4 6 8 10 ...
        /*
        sum+= 2;
        sum += 4;
        ...
         */
        int sumOfEven=0;

//        for(int i=0; i<=100; i+=2){
          /* sumOfEven+=i;
        }
        System.out.println(sumOfEven);  or :  */

        for(int i = 0; i <= 10000; i++){
            if(i % 2== 0 ) {
                sumOfEven += i;
            }
        }

        System.out.println(sumOfEven);

        System.out.println("=======================================================");
        // task04:
        // 1 3 5 7 9 .... 99

        int sumOfOdd = 0;

        /*
        for(int i = 1; i <= 99; i += 2 ){
            sumOfOdd +=i ; // sumOfOdd = sumOfOdd +i ;
        }
        */

        for(int i = 0; i <= 100; i++){
            if(i%2 != 0){
                // sumOfOdd = sumOfOdd + i;
                sumOfOdd += i;
            }
        }

        System.out.println(sumOfOdd);













    }
}
