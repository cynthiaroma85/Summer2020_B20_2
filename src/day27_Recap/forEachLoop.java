package day27_Recap;

public class forEachLoop {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        for(int i=arr.length-1 ; i>=0 ;i--){ // i = index
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int each:arr){   // each for each elemen t NOT !! index#  //
            System.out.print(each); // for each loop order is fixed
        }
        System.out.println();
        System.out.println("=============");

        int[] score={10,20,30,40,50,60,70,80,90,100,110};

        for(int each:score){
            if(each%3!=0){
                continue;
            }
            System.out.print(each+" ");
        }



    }
}
