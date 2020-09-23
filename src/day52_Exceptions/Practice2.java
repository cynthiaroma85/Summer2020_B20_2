package day52_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        /**
         * scanner keeps running if user does not enter a number// Dilyar
         */
        int n=0;

        boolean isDigit = false;

        while(!isDigit) {  // true
            Scanner scan = new Scanner(System.in);
            System.out.print("enter: ");
            try {
                n = scan.nextInt();
                isDigit = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input type");
            }
        }
        System.out.println("n = " + n);
    }



}
