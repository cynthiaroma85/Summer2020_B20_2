package day25_ArraysPractice;

public class ShortestString2 {
    public static void main(String[] args) {

// for eachLoop method

        String[] arr= {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength=arr[0].length();

        for(String each:arr){  // to fing out the minimun lLENGTH
            ;  // 4 8 4 8 (length of each character)

            if(each.length()<minLength){
                minLength=each.length();
            }
        }
        System.out.println(minLength);

        for(String each:arr) {  // how many string.length MATCH with the minLength
            if(each.length()==minLength){
                System.out.println(each);
            }
        }




    }
}
