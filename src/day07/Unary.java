package day07;

public class Unary {
    public static void main(String[] args) {

        System.out.println(-1 + -10);
                         // -1 -10= -11

        System.out.println( -1 - -10);// 9


//--------------------------------------
       // --;  PRE DECREMENT
        int a=20;
        //a = a-1; //19
        --a;
        System.out.println(a);

        int x=100;
        System.out.println(--x);

        // ++  PRE INCREMENT
        int b=10;
       // b=b+1; // b=11
     ++b;
        System.out.println(b);

        int z=200;
        System.out.println(++z);

        //______________

    }
}
