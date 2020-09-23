package day18_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
           //want this output "avaJ"

        String s1= str.substring(1); // ava
        String s2= str.substring(0,1);// in order to get the First letter
        String result=s1+s2;

        System.out.println(result);

    }
}
