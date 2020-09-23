package day24_Arrays;
/*
 3. Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
 */
public class Average {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10}; // number of character different than:
        //         0 1 2 3 4 5 6 7 8 9  index#

        int sum= 0;

        for(int i=arr.length-1 ; i>=0; i--){ //number of time rpeated and if declared: i==character
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);



       double average= (double)sum/arr.length; //implicit to get more accurate result
         /*      double d1 = 10/3; //3 ==> 3.0
                 double d2 = 10/3.0; // 3.33  */

        System.out.println("Average number: "+average);











    }
}
