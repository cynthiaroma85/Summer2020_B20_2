package day16_String;

import java.sql.SQLOutput;
import java.util.Scanner;
      /*  1. Ask user to enter two words. Print first word without its first character
      then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana*/
public class substring_Practice {
    public static void main(String[] args) {

        String str= "I like to drink Pepsi";
        String drink = str.substring(16); // Pepsi
        System.out.println(drink);

        String action = str.substring( 10, 14+1);

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first word"); // apple
        String str1=scan.next();

        System.out.println("Enter second word");// banana
        String str2=scan.next();

        //want to output: ppleanana
        // String result= str1.substring(1).concat( str2.substring(1)); or
        String result= str1.substring(1)+str2.substring(1);

        System.out.println(result);






    }
}
