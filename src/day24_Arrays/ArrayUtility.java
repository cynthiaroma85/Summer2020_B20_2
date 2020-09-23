package day24_Arrays;
import java.util.Arrays;
public class ArrayUtility {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println(arr); // not for arrays!

        System.out.println(  Arrays.toString(arr)  ); // in order to print out each character/variable
                                                  // we need to assign it to a String
        System.out.println(arr[0]); // but i can print one single character !!!

        String s1 = Arrays.toString(arr);
        System.out.println(s1);


        String[]  names = {"Muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};

        System.out.println(names);  // in order to print array variable we MUST convert it to string
        System.out.println( Arrays.toString(names) );// correct way to print

        String str1 = Arrays.toString(names);  // or declaring array into a string variable
        System.out.print(str1); // now print out string variable

        System.out.println();
        System.out.println("================================================");

        int[] nums = {5,4,6, 5, 10, 3, 4};

        System.out.println( Arrays.toString(nums) );

        Arrays.sort(nums);  //[3, 4, 4, 5, 5, 6, 10]  in ascending order

        System.out.println( Arrays.toString(nums) );

        System.out.println("Maximum number: " + nums[nums.length-1] );
        System.out.println("Minimum number: "+ nums[0] ) ;

        String students[] = {"Mehdi", "Elkem", "Meee", "Trump"};

        Arrays.sort(students);

        System.out.println( Arrays.toString(students)  );

        //["Elkem",  "Meee",  "Mehdi", "Trump"]  // alphabetical order
        // A ~Z
        System.out.println("===================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2); //true
        System.out.println(r1);

        int[] arr3 = { 2, 1, 3 };

        Arrays.sort(arr2); // arr2:  1, 2, 3
        Arrays.sort(arr3); // arr3:  1, 2, 3

        boolean r2 = Arrays.equals(arr2, arr3);// true
        System.out.println(r2);

        int[] arr4 = {1,1,2,3};
        int[] arr5 = {1,2,3};

        boolean r3 = Arrays.equals(arr4, arr5);  //false
        System.out.println(r3);








    }

}
