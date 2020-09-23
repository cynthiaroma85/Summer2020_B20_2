package Office_Hours.practice_miscelanious;

public class uniqueWord_Array {
    public static void main(String[] args) {

        String[] words={ "C#","C#","PHYTON", "PHYTON", "JAVA"};



        for(String b:words) {

           // String s = b;//  words[0]; // unnecesary  so erase it
            int count = 0;

            for (String each : words) { // "C#","C#","PHYTON", "PHYTON", "JAVA"
                if (each ==b) {  // if Ch# = to index0+1, toindex1 +1, == 2
                    count += 1;
                }
            }
            if (count==1){
                System.out.println(b);
            }

        }


    }
}
