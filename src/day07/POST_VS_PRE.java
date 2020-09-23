package day07;

public class POST_VS_PRE {
    public static void main(String[] args) {

        int a=10;

        System.out.println(++a); //11
        System.out.println(a); //11

        int b=10;

        System.out.println(b++); //10
        System.out.println(b);  //11

        //////////////////////////

        int c=25;
        int d= c++;  // d=25
                  // c=26
        System.out.println(c);//26
        System.out.println(d);//25

        //--------------------

        int x=8;
        int y = x--;

        System.out.println(y); //8
        System.out.println(x); //7
       //------------------------

        int A = 1;// A=-1
        A = -A-- + A++ / -A-- * --A;
        // A =  -1    +  0  /   -1  *  -1
        //  A =  -1   +    0   *   -1
        //   A = -1 +  0  = -1

        System.out.println(A);

        System.out.println("============================");
        int B = 50; //B = 50
        B = --B + B++ + B-- + B++;
        // B =  49  + 49  + 50  +  49
        // B =  197

        System.out.println(B);





    }


}
