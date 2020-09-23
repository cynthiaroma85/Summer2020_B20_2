package day24_Arrays;

public class UniqueNumber {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3};
        //{1,1,2,3,3


        //FOR LOOP:
        for(int j=0; j <= arr.length-1; j++){  // to check each number(character)(index #)
            // j: 0,1,2,3,4
            int unique= arr[j];  //1  1  2  3  3
            int count = 0 ;

            for(int i=0; i <= arr.length-1; i++){  // only calculates the frequnecy of num
                int compare =  arr[i]; // 1  1  2  3  3
                if( compare == unique){
                    count+=1; // or count++
                }
            }

            if(count == 1){
                System.out.print(unique +" ");
            }
        }

        System.out.println("==================================");





    }
}
