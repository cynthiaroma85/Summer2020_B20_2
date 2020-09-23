package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor="brown";
    final String bloodType="A";

    final int x; // final instance variables need to be initialized right away
    final static int y; // final instance variables need to be initialized right away

    static { // to initilize static varibles
        y=300;
    }

    public FinalVariable(){ // constructor to initliaze instance variables
        x=100;
    }

    public static void main(String[] args) {

        final LocalDate dateOfBirth= LocalDate.of(1985,1,20);
        //"final"  to make sure that a variable cannot be REASSIGNED
       // dateOfBirth=LocalDate.of(1990,6,5);
        System.out.println(dateOfBirth);

      final long ssn=123456789; // "final" to be constant , not abke to reassigned or changed
        System.out.println(ssn);


        System.out.println(ssn);

        final double PI = 3.14;
        //  PI = 2.14;

        System.out.println(PI);


        final char gender = 'M';
        // gender = 'F';

        final String birthPlace = "USA";
        // birthPlace = "England";

        final int a;

        //  System.out.println(a);







    }

}
