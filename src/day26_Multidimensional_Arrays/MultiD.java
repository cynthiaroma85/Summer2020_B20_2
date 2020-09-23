package day26_Multidimensional_Arrays;

import java.util.Arrays;

public class MultiD {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        //                   0    1       0    1   2        0    1    2   //index of the elements of each array
        char[][]  ch2D = { {'A', 'B'},  {'C', 'D', 'E'},  {'F', 'G', 'H'} };
        //                      0               1                  2    // each index == one group of array

        System.out.println(  Arrays.toString( ch2D[1]  ) ); // [C, D, E]
       // Arrays.toString to print all elements ONLY
        System.out.println(  Arrays.toString( ch2D[2]  )  ); //  [F, G, H]

        // H
        System.out.println( ch2D[2][2] ); // no need of Arrays>toString because its only ONE Element!

        // C
        System.out.println( ch2D[1][0] );  // H  no need toString since ots only ONE ELEMENT

        // G  B
        System.out.println( ch2D[2][1]+"    "+  ch2D[0][1] ); //  G B can concat each element

        System.out.println("===============================================================");
        // {1,2,3} , {4} , {5,6},  {7,8,9, 10}

        //   int[] arr1D = {  {1,2,3}  };

        int[][]  nums = { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} }; // to assign arrays
        //                   0        1      2          3

        // [7,8,9, 10]
        System.out.println(  Arrays.toString( nums[3] ) ); // because group of elemnets

        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9, 10]
         */
        for(int i=0; i<=nums.length-1; i++){
            System.out.println(Arrays.toString(nums[i])); // each array diferent line
        }                                // { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} }

        // System.out.println(Arrays.toString(nums));
        System.out.println( Arrays.deepToString(nums)); // one single line



    }
}
