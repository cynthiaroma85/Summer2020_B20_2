package day19_forLoop;

import java.util.Scanner;
/*
    7. write a program that can calculate the sum of all numbers between
     1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
 */
public class sumOfNumbs {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 0){

            for(int i = 1; i <= num; i++){
                // sum = sum + i;
                sum += i;   // statement of LOOP
            }               // thats why need to close it here

            System.out.println(sum); // print statement of IF ==> printed outside loop {}

        }else{
            System.out.println("Invalid Entry");
        }





    }

}
