package day06_ComparisonOperators;

public class Implicit_explicit {

    public static void main(String[] args) {

        short s1=100;
        long l1=s1; //implicit casting is AUtomaticaly

        long l2=(long)s1; // if we implicit manually

        int I1=300;
        double D1=I1; // 300.0

        System.out.println(D1);

        //==========================================//

        double d1=400.55555;
        int i1= (int)d1; // 400  it has to be manually to explicit casting
        System.out.println(i1);

        long L1=4400;
        short sh1=(short)L1; // also have fall in  the range of the primitive 400 is in short
        System.out.println(sh1);

        double m1=34.5;
        float f1=(int)m1; // 34int to float will be Decimal 34.5

        System.out.println(f1);










    }




}
