package day22_NestedLoop;
/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 *******
 ******
 *****
 ****
 ***
 **
 *
 */
public class Nested_Loop4 {
    public static void main(String[] args) {

for( int v=1; v<=7;v++){ // 1 2 3 4 5 6 7
    for(int h=1; h<=v; h++){ //1 2 3 4 5 6 7
        System.out.print("*");
    }
    System.out.println();
}

        System.out.println("=========================");

for(int v=7; v>=1;v--){ //7 6 5 4 3 2 1
    for( int h=v; h>=1;h--){  // 7 6 5 4 3 2 1
        System.out.print("*");
    }
    System.out.println();
}



    }
}
