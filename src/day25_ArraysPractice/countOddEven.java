package day25_ArraysPractice;
/*
  5. Write a program that will take five Strings and save them into an array called arr.
  and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
 */

public class countOddEven {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,100, -100, -200, 400, 50000, 10000000, 123};
        int countEven = 0;
        int countOdd = 0;

        String even = "";  // coberting to string
        String odd = "";
int sumOdd=0;
        for( int each : nums){

            if(each %2 ==0){
                countEven += 1;
                even += each+" ";
            }else{
                countOdd++;
                odd += each+" ";  // since odd is string add""
                sumOdd=sumOdd+each;
            }

        /*
           if(each %2 ==0){
               countEven += 1;
               even += each+" ";
               continue;
           }
           countOdd++;
           odd += each+" ";
        */

        }


        System.out.println("Even Numbers: "+even);
        System.out.println(countEven);
        System.out.println("Odd Numbers: "+odd);
        System.out.println(countOdd);

        System.out.println(sumOdd);




    }
}
