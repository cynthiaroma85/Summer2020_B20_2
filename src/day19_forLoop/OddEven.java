package day19_forLoop;
/*warmup tasks:
    1. write a program that can print all the ODD numbers between 0 ~ 100
    that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100
    that can be divisible by 3 & 5
*/
public class OddEven {
    public static void main(String[] args) {


        for (int i=1;i<=99;i+=2){ // when declared
            if (i%3==0 && i%5==0){   //BOOLEAN expression
                System.out.println(i+" ");// as long as i in between the () it can be reusable
            }   // print stament MUST be between the condition
        }


        for (int i=0; i<=100; i++){
            if(i%2==0){  // pre condition:for i need to be even
                if (i%3==0 && i%5==0){  // also divisble by 3 and 5 (%15)
                    System.out.println(i +" ");
                }
            }
        }




        System.out.println();

        for(int i = 0; i <= 100; i++){

            if(i % 2 != 0 ) { // pre: i MUST be odd number
                if(i % 5==0 && i % 3 ==0 ) { // sub: MUST be divisible by 3&5
                    System.out.print(i + " ");
                }
            }

        }

        System.out.println();

        System.out.println("=====================================");

        //Task02:

        //i:  0 2 4 6 8 10  ... 100

        for(int i = 0; i <= 100; i+=2 ){

            if(i % 5==0 && i % 3 ==0 ) {
                System.out.print(i + " ");
            }

        }

        System.out.println();


        for(int i = 0; i <= 100; i++){

            if( i % 2 == 0) { // pre: MUST be Even number
                if(i % 3 == 0 && i % 5 == 0) { // the number MUST be divisible by 3 & 5
                    System.out.print(i + " ");
                }
            }

        }







    }


}
