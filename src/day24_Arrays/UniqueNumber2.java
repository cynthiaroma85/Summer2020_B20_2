package day24_Arrays;

public class UniqueNumber2 {
    public static void main(String[] args) {

        int[] arr = {1,1,4,3,3 };


        for(int a: arr){ // Declare a to check each character in the array arr
            int count = 0 ;

            for(int b: arr){  // agin chech at EACH character its frecuency
                if(b == a){   //only calculates the frequnecy of num
                    count++; // count+=1
                          }
                          }
                if(count == 1){
                System.out.print(a+" ");
                             }
                       }



    }
}
