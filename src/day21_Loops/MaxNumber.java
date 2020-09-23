package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int max=-2147483648;//30

        for(int i=0; i<5 ; i++){
            System.out.println("Enter a number"); //5 inputs from loop
            int num=scan.nextInt();  // 10 20 5 30 15

            if(num>max){
                max=num; // only will assign IF is greater than MaX
                         // then in the memory max will change to the latest maxNuMBER
            }
        }
        System.out.println("Max number: "+max);





    }
}
