package Practice;

import java.lang.reflect.Array;

public class JavaPractice {

    // tre parameter array  first index second index

    // static to call it without creating an object
    public static int[] swampElem(int[] arr, int num1, int num2){

        int index = 0;
        for (int i = 0; i <= 6; i++) {
            arr[index++] = i;
        }

        int num3 = arr[3];

        arr[1] = arr[3];
        arr[3] = num3;

        return arr;
    }


    




}



