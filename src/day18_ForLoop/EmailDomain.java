package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email= scan.next();

        int index1= email.indexOf("@");
        int index2= email.lastIndexOf(".");
                   // (  to take the next one, because it wont take . )
        String domain= email.substring(index1+1,index2);

        System.out.println(domain);





    }

}
