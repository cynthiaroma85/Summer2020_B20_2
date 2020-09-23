package day19_forLoop;

public class reverseString {
    public static void main(String[] args) {

        String str= "Cyber";
                   //01234
        String result="";
        for(int i=4; i>=0; i--){
            result+=str.charAt(i); // += to a String it will be concatination
        }
        System.out.println(result); // rebyC

        /*
        for(int i = str.length()-1 ; i >= 0; i-- ){ //i: 4, 3, 2, 1, 0
            result +=  str.charAt(i);
        }

        System.out.println(result);

         */

        System.out.println("================");


        String str2= "Cybertek";
        //01234
        String result2="";
        for(int i=str.length()-1 ; i>=0; i--){  // when Bigger Srtring , can call las index
            result2+=str.charAt(i); // += to a String it will be concatination
        }
        System.out.println(result2);


    }
}
