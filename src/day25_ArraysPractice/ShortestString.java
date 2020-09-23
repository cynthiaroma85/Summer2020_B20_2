package day25_ArraysPractice;
import java.util.Arrays;
public class ShortestString {
    public static void main(String[] args) {


        String[] arr= {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength=arr[0].length();  // to compare each element with the first one

        for(int i=0; i<=arr.length-1; i++){  // to fing out the minimun lLENGTH
           int l=arr[i].length();  // 4 8 4 8 (length of each character)

            if(l<minLength){
                minLength=l;   // 4
            }
        }
        System.out.println(minLength);

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);   // Amir Anam
            }
        }







    }
}
