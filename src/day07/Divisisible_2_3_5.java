package day07;

public class Divisisible_2_3_5 {

    public static void main(String[] args) {

         /*2. write a program that can check if a number is evenly divisible by 2, 3, 5
        Ex:
        number = 65;

        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true*/


        int number=25; // u can test from multiples escenarios
        boolean divisibleBy2= number%2==0;
        boolean divisibleBy3= number%3==0;
        boolean divisibleBy5= number%5==0;

        System.out.println(number+ " is evenly divisible by 2: "+ divisibleBy2);
        System.out.println(number+ " is evenly divisible by 2: "+ divisibleBy3);
        System.out.println(number+ " is evenly divisible by 2: "+ divisibleBy5);


    }



}
