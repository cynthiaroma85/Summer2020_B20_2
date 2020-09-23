package day19_forLoop;

public class breakStatement {
    public static void main(String[] args) {

        for(int i=0; i<=5; i++){
            System.out.println("hello");
            break;                     // because this is  its step#3 and if there is a break
        }                               // it will exit the loop ==> 1 print statement

        System.out.println("=====================");

        for(char ch = 'A'; ch <= 'H'; ch++) { // ch: A  B C

            if (ch == 'C') {
                break;
            }

            System.out.print(ch + " "); //A B
        }
            System.out.println("==========================");


            for ( int i=0; i<=50 ; i+=10){ //0 10 20 30
                System.out.println(i+" "); // values wil be printed first,
                                        // then condition if() will be applied

                if(i==30){   // because of the printing flow 30 will be Printed
                    break;   // printe statement is first and then Break is executed
                }
            }

        System.out.println("=========================");
        for ( int i=0; i<=50 ; i+=10){
            if(i==30) {   // because of the printing flow 30 will NOT be Printed
                break;   // after i hits 30 then (if will be true) so break will be EXECUTED
            }
            System.out.println(i+" ");
        }

        System.out.println("======================");
        for (char ch='A'; ch<+'D' ; ch++){ // ABCD
            if(ch=='C'){
                break;  // because of flow , after ch==C it will stop everything BREAK;
            }
            System.out.print(ch+" "); // so output will be: A B
        }





    }
}
