package day21_Loops;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int min=2147483;     //(maximun integer number)

        for(int i =0 ; i <5; i++){
            System.out.println("Enter a number:");
            int num=scan.nextInt(); // 10 20 40 30 50

            if (num<min){
                min=num;
            }
        }

        System.out.println("Is the minimun number:");



    }
}
