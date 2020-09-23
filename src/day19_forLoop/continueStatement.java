package day19_forLoop;

public class continueStatement {
    public static void main(String[] args) {

        for(int i=1; i <= 5; i++){  //i: 1, 2, 3, 4, 5

            if( i == 3){
                continue;  // jumps to the next iteration or SKIPP
            }
            System.out.print(i+" "); // 1  2  4 5
        }

        System.out.println("==============================");

        for(char ch = 'A'; ch <= 'F'; ch++){ // ch: A B C D E

            if(ch == 'C' || ch == 'F') {
                continue;
            }
            System.out.print(ch +" "); // A B D E ( will skipp C and F)
        }

        System.out.println();

/*

        for(char ch = 'A'; ch <= 'F'; ch++){ // ch: A B C D E F

     System.out.print(ch +" "); // A B C D E F   becayse of flow statement it print first!
            if(ch == 'C' || ch == 'F') {
                continue;
            }
      }
 */







    }
}
