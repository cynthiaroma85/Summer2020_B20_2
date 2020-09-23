package Office_Hours.practice_miscelanious;

public class uniqueNum_Array {
    public static void main(String[] args) {

        int[] arr1={1,1,3,2,2};

     /*   int num=arr1[0];  // to compare with each one
        int count=0;

        for (int each : arr1) {
            if(each==num){
                count+=1;
            }
        } */

        for( int b:arr1){
              // to compare with each one
            int count=0;

            for (int each : arr1) {
                if(each==b){
                    count+=1;
                }
            }

            if (count==1){
                System.out.println(b);
            }

        }

/*
for(int a: arr){ // Declare a to check each character in the array arr
            int count = 0 ;

            for(int b: arr){
                if(b == a){
                    count++;
                          }
                          }
                if(count == 1){
                System.out.print(a+" ");
                             }
                       }

 */


    }
}
