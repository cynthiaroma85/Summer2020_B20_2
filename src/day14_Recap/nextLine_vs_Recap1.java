package day14_Recap;
import java.util.Scanner;

public class nextLine_vs_Recap1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age =   input.nextInt(); //19

        input.nextLine(); //to erase Enter from the memory

        System.out.println("Enter your full Name");
        String fullName = input.nextLine(); // Cybertek SchoolEnter
                                           // whenever nextLine after any int double boolean etc
                                           // alwasy need to add another ---.nextLine();
        System.out.println("Enter your company Name: ");
        String companyName = input.nextLine(); // if nextline after another nextLine
                                              // then no need of another nextline

        System.out.println(fullName+" is "+age+" years old");





    }
}
