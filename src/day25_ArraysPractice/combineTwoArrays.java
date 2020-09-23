package day25_ArraysPractice;

import java.util.Arrays;

public class combineTwoArrays {
    public static void main(String[] args) {

        int[] arr1={1,3,2};
        int[] arr2={4,5};

        int size3= arr1.length + arr2.length;

        int[] arr3= new int[size3];

      // assign manually to arr3:
      /*  arr3[0]= arr1[0];
        arr3[1]= arr1[1];
        arr3[2]= arr1[2];

        arr3[3]= arr2[0];
        arr3[4]= arr2[1];  */

        int index=0;

        for(int each : arr1){
            arr3[index]=each;
            index+=1; // or index++; will increase the index for the next/following assign
        }

        for(int each : arr2){
            arr3[index]=each;
            index+=1;
        }



        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3) );

        System.out.println("Maximum: "+arr3[arr3.length-1]);











    }
}
