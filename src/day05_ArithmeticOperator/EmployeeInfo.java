package day05_ArithmeticOperator;

import java.sql.SQLOutput;

public class EmployeeInfo {

   /* Warmup tasks:
            1. create a class named EmployeeInfo
            declare the following variables:

    firstName = John
    lastName = Daniel
    gender = Male
     age = 35
    companyName = CapitalOne
    jobTitle = SDET
    isFullTime = true
    isMarried = false
    salary = 120000.50
    output:
    Employee' full name is: John Daniel
    John Daniel' gender is: Male
    John Daniel' age is: 35 years old
    John Daniel works at: CapitalOne
    John Daniel' Job title is: SDET
    John Daniel' salary is 120000.5 $
    John Daniel is full time employee: true
    John Daniel is married: false*/

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Jones";
        char gender = 'F';
        int age = 45;
        String companyName = "Capital One";
        String jobTitle = "QA";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;
String fullName= firstName+" "+lastName; // concate two string in 1
                                           // Aaron Jones

        int a=10;
        int b=20;
        int c= a+b;

        System.out.println("Employee' full name is:"+fullName);
        System.out.println(firstName+" "+lastName+"' gender is: "+gender);
        System.out.println(firstName+" "+lastName+"' age is: "+age+" years old");
        System.out.println(firstName+" "+lastName+" works at: "+companyName);
        System.out.println(firstName+" "+lastName+"' job title is: "+jobTitle);
        System.out.println(firstName+" "+lastName+"' salary is: $"+salary);
        System.out.println(firstName+" "+lastName+" is full time employee: "+isFullTime);
        System.out.println(firstName+" "+lastName+" is married: "+isMarried);





    }



}
