package day4_Variables;

public class Variables2_char {
    public static void main(String[] args) {

        char ch1='A'; //  all character in single quote
        char ch2= 65;
        System.out.println(ch1);
        System.out.println(ch2);
        char ch3= 35000; // range of chart its 0 to 65 535

        System.out.println(ch3);

       // char ch4= 66000; // compiled error because its out of range
        char ch5=45876;
        System.out.println(ch5);

        char c1='A'; //65
        char c2='B';//66 this are already assinged in the asccii table

        System.out.println(c1+c2);

        int result= c1+c2; //131 ascii table
        System.out.println(result);

        double d=c1+c2;
        System.out.println(d); // it will 131.0  because double its a decimal

        int num1='A'; // it will take the number because it assigned to a number type

        char c4=65+45; // it will be a character Not a Number because of CHAR
        System.out.println(c4);

        char c5='Z';
        char c6=897;

        char c7='1'; //49

        System.out.println(c7); //1 ( only character printer
        System.out.println(c7+1);
//                          49+1

        int r1=c7;
        System.out.println(r1); // int:49

        char charz= 'Z';

        System.out.println("================");

        int n1='A'+2;

        char a1='@';
        char a2=64;



    }



}
