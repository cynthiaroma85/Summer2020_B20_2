package day07;

public class quiz {
    public static void main(String[] args) {
        int num=100;
        boolean positive = num>0;
        boolean negative = num<0;
        boolean zero= num ==0;

        System.out.println(num + " is positive? " + positive);
        System.out.println(num+" is negative/ "+negative);
        System.out.println(num+" is Zero? "+zero);

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        // iNum = fNum;
        fNum = iNum;
        dNum = fNum;
        fNum = (float)dNum;


        System.out.println("Result A" + 0 + 1);
        //                   "Result A0" + 1
        //                    "Result A01"

        System.out.println("Result B" + (1)  + (2) );
        //                   "Result B1"  + 2
        //                   "Result B12

        System.out.println( "Result B" +   (1 + 2)   );


        System.out.println( "5 + 2 = " + 3 + 4 );
        //                 "5 + 2 = 3" + 4
        //                  5 + 2 = 34

        System.out.println( "5 + 2 = " +  (3 + 4) );
        //              "5 + 2 =" + 7
        //                 5 + 2 = 7





    }
}
