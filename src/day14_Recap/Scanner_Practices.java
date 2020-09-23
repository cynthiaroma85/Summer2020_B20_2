package day14_Recap;
import java.util.Scanner;
public interface Scanner_Practices {
    // enter gender next()
    // / age nextInt
    // country name nextLine() ( because some countries two names)
    // zipcode (nextInt()
    // full name/ nextLine()
    // full company name  nextLine()

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); // memory: enter enter

        System.out.println("Enter your gender:");
        String gender= input.next(); // female enter ( next() will FEMALE

        System.out.println("Enter age:");
        int age= input.nextInt(); // 19 enter

        input.nextLine(); // erased all ENTERS!
        System.out.println("Enter country name:");
        String countryName= input.nextLine(); //after any other method of scanner
                                     // use always another nextLine() method
                                  // becayse it takes every thing from memory like the 2 ENTERS

        System.out.println("Enter zipcode"); //12345 enter ( in the memory)
        int zipCode= input.nextInt();

        input.nextLine();// to erase previous ENTeR from zipcode !
        System.out.println("Enter Full Name:");
        String fullName= input.nextLine(); //( takes everything even Enter from full name)
                                            // so that means nothing in the memory after this
        System.out.println( "Enter full company name:");
        String companyName= input.nextLine();





    }
}
