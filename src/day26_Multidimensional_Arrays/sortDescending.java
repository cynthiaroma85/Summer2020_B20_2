package day26_Multidimensional_Arrays;

import java.util.Arrays;
/*
  1. write a program that can sort the array in descending order
            ex:
                          arr1: { 10, 11, 8, 9, 12, 5, 15};
                output:   arr2: {15, 12, 11, 10, 9, 8, 5}
 */
public class sortDescending {
    public static void main(String[] args) {


                int[] arr ={ 10, 11, 8, 9, 12, 5, 15};

                Arrays.sort(arr); // 5 8 9 10 11 12 15
                System.out.println( Arrays.toString(arr));

                int[] desc = new int[arr.length];      // TO DECLARE A NEW ARRAY
            /*
            desc[0] =  arr[2]or arr[arr.length-1] ;
             desc[1] =  arr[1];
             desc[2] =  arr[0];
*/
                int k =arr.length-1;
                for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
                    desc[i] =  arr[k];
                    k--; // k: 2, 1, 0
                }

              /*  int k=0;
                for(int i=desc.length-1; i>=0; i--){
                    desc[k++]=arr[i];
                }  */



                System.out.println(Arrays.toString(desc));



            }
}
