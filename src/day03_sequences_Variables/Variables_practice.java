package day03_sequences_Variables;

public class Variables_practice {

    public static void main(String[] args) {
        //100, 200
        int num1=15000;
        int num2=200000;
        int sum= num1+num2;
        // int and double always preferable
        // also the sum have to be greater variable

        System.out.println(sum);

        float num3=3.5f;
        double a =num3;
      //  long b=num3  CANNOT be assignetd to a small primitive

        long x=100;
        float y=x;
        double z=x;

        System.out.println(x);//100
        System.out.println(y);//100.0 because its a decimal primitive
        // int p=3.5 because small primitive can be assigmentt it to larger primitive

        float f1=100;
        float f2=100.0f;

        System.out.println(f1);
        //even if its whole number when assigned to a decimal will be DeciMal
        System.out.println(f2);

        //==================================================





    }

}
