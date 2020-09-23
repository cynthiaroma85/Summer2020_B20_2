package day29_CustomMethods;

public class RemoveDuplicates {


    //10. write a method that can remove the duplicates from the string

    public static void main(String[] args) {
        String str = "ababababababcccccccccddddddddeeeeee";
        //"abcde"
        removeDup(str);  // remove dup method
    }


    public static void removeDup(String str){  //"abab"
        String nonDup = ""; //"ab"

        //[a, b, a, b]
        for( String each : str.split("") ){  // split to converted to data structure
                                                  // then we can use each loop
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }

}
