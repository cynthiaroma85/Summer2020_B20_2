package day23_Arrays;

public class MinMax {
    public static void main(String[] args) {

        int[] arr = {7,5,4,6,4,1};
                 //  0 1 2 3 4 5  index#
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i <= arr.length-1; i++ ){ //index number starting at 1
            if (arr[i]>max){
                max= arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        System.out.println("=====================");


        int result =0;
        for (int i= 0 ; i<5; i++){
            if (i==3){
                result+=10;
            }else{
                result+=i;
            }
        }
        System.out.println(result);



    }
}
