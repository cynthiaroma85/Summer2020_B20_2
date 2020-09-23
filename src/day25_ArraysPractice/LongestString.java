package day25_ArraysPractice;

public class LongestString {
    public static void main(String[] args) {


        String[] arr= {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int maxLength=arr[0].length();

        for(String each:arr){ // for find the MAX Length
            if( each.length()>maxLength){
                maxLength=each.length();
            }
        }
        System.out.println(maxLength);

        // now print oout all String with max length
        for(String each:arr){
            if(each.length()==maxLength){ // each will collect all string = maxlength
                System.out.println(each); //
            }

        }











    }
}
