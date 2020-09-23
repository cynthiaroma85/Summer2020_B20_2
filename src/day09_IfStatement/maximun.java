package day09_IfStatement;

public class maximun {
    public static void main(String[] args) {



/*warmup tasks:

        1. write a java program that accepts three numbers and return the maximum number
        (assume that none of them are equal)
        2. write a java program that accepts three numbers and return the minimum number
        (assume that none of them are equal)
        3. write a java program that accepts three numbers and rteurn the mediam number
        (assume that none of them are equal)hol*/


            double a = 500;
            double b = 200;
            double c = 1000;

            boolean aIsMax =   a > b   &&  a > c;
            //               500 > 200  &&  500 > 1000
            //                  true && false ==> false

            boolean bIsMax =  b > a && b > c;
            // aIsMax == false && b > c ;

            boolean cIsMax =  c > b && c > a  ;
            // aIsMax == false && bIsMax == false;
            // !aIsMax && !bIsMax  ==> !(aIsMax && bIsMax)

            double max = 0;  // we want to assign the maximum number to variable max

            if(aIsMax){
                //  System.out.println(a);
                max = a ;
            }

            if(bIsMax){
                //  System.out.println(b);
                max  = b;
            }

            if(cIsMax){
                //   System.out.println(c);
                max = c;
            }

            System.out.println(max +" is maximum number");

          }
}
