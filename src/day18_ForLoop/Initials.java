package day18_ForLoop;
/*
1. write a program that asks user's first and last name, then prints out the initials of the user
                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName=scan.next();
        String lastName=scan.next();

        // One Method:
        String initial1 = firstName.substring(0, 1)+ "." + lastName.substring(0,1); // "jp"
        initial1 = initial1.toUpperCase();  // "JP"

        System.out.println(initial1);

        // Second Method:
        char ch1=firstName.charAt(0); // result will be a character
        char ch2=lastName.charAt(0);
        // So we will converted it to a string
        String initial2= ""+ ch1+ch2; // because is an addition it will take the char ascii value
               initial2= initial2.toUpperCase();

               System.out.println(initial2);

    }

}
