package day05_ArithmeticOperator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(20+3-2+1);
                         // 23 -2
                         //21+1= 22
        System.out.println(20*3);

        System.out.println(2+3-1*4);
                         //2+3- 4  ( multiplication is higher)
                         // 5-4=1  ( plus and subtraccion same so in order L2R

        System.out.println(10/3);// int/int = int
        System.out.println(10.0/3); // double/ int = double
        System.out.println(10/3.0);

        System.out.println(10%4);
                          // 10/4 =2 so 10-(4*2) =2

        System.out.println(30%8);
                         //30/8=3 so 30-(8*3)=6 remainder
        System.out.println(99%4);
                        //


    }




}
