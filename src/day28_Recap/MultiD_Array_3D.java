package day28_Recap;

import java.util.Arrays;

public class MultiD_Array_3D {
    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5}};
        System.out.println(Arrays.deepToString(arr2D)); // 2D or more the deepToSTRING
        System.out.println(Arrays.toString(arr2D)); // error because 2D

        //                      0        1              0         1
        int[][][] arr3D = { {{1,2,3} , {4,5}}   ,   {{6,7,8}  , {9,10}}   };
        //                          0                        1
        System.out.println(Arrays.deepToString(arr3D)); // for more than 2D

        // {{6,7,8}, {9,10}}     = 2D so need deepToString
        System.out.println(  Arrays.deepToString( arr3D[1] )  ); //[[6, 7, 8], [9, 10]]

        // {4,5} =     1D so  need  toString
        System.out.println( Arrays.toString( arr3D[0][1] ) );

        //8       = element No Need of toStr or deeStr
        System.out.println( arr3D[1][0][2] );


        System.out.println("==========================================");
        // int[][][] arr3D = { {{1,2,3} , {4,5}}   ,   {{6,7,8}  , {9,10}}   };

        for(int i =0; i <=arr3D.length-1; i++){ //i: index of 2D arrays
            int[][] each2D =  arr3D[i];

            for(int j = 0; j <= each2D.length-1; j++){ //j: index of 1D array
                int[] each1D = each2D[j];

                for(int k = 0; k <= each1D.length-1; k++ ){//k: index of elements
                    System.out.print(each1D[k]+" ");
                }
       // System.out.println();count++;
            }
            System.out.println(); // for the 2D arrays separate
        }


        System.out.println("============================================");

        //  // int[][][] arr3D = { {{1,2,3} , {4,5}}   ,   {{6,7,8}  , {9,10}}   };

        for(int[][] each2D : arr3D ){

            for(int[] each1D : each2D ){

                for(int eachElement : each1D){
                    System.out.print(eachElement+" ");
                }
            }
            System.out.println();
        }







    }
}
