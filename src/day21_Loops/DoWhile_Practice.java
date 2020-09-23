package day21_Loops;

public class DoWhile_Practice {
    public static void main(String[] args) {

        int num = 1;

        do{
            System.out.print(num +" ");  // 1 2 3 4 5

            num++;                       //2 3 4 5 6
        }while(num <= 5);

        System.out.println();

        System.out.println(num);

        System.out.println("===========================================");

        char ch = 'Z';
        do{
            System.out.print(ch+" ");  // java executes top to bottom
            ch--;
        }while(ch >'A');
        System.out.println();
        System.out.println(ch);


    }
}
