package day19_forLoop;
/*
    5. Write a program that will print out all letters in English alphabet
    in ascending order
    6. Write a program that will print out all letters in English alphabet
    in descending order
 */
public class Characters_A_Z {
    public static void main(String[] args) {

        for(char ch='A' ; ch<= 'Z'; ch++){
            System.out.print(ch+" ");
        }


        for(int i=65; i<=90; i++){ //times print staement will reapet/ print==25
            // (char) i;
            //System.out.println(i);  or:
            System.out.print((char)i);} // EXPLICIT CASTING to get char characters!

        // Make sure to close {} curly braces so i can be reusable
        System.out.println();


        System.out.println("=============================================");


        //task06:
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 90; i >= 65;  i--){
            System.out.print( (char)i +" " );
        }

        System.out.println();


        System.out.println("======================");

        /*
        for(int i = 0; i < 65000; i++){
            System.out.print((char)i +" ");
        }
         */



    }




    }

