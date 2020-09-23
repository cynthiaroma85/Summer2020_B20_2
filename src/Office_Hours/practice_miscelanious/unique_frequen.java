package Office_Hours.practice_miscelanious;

public class unique_frequen {
    public static void main(String[] args) {

        String str="ABABC";

        String expResult=""; //C

       for( int j=0 ; j<str.length() ; j++){  //A B A B C

            char ch= str.charAt(j); // to compray at each index the word
            int count=0;

            for( int i=0 ; i<str.length() ; i++){ //frequency of each character
                char each= str.charAt(i); //A
                if (each==ch){ //  if it repeat
                    count+=1;
                }
            }
            if(count==1){
                expResult+=ch;
            }

        }

        System.out.println(expResult);






    }
}
