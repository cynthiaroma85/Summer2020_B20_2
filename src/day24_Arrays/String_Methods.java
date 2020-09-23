package day24_Arrays;
import java.util.Arrays;
public class String_Methods {
    public static void main(String[] args) {

        String str = "ABCDEF";
        char[] ch = str.toCharArray(); // [ A B C D E F ]

        System.out.println( Arrays.toString(ch ) );  //[ A B C D E F ]

        System.out.println("===========================");
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // [D, C, E, B, A]
        char[] ch2 = str2.toCharArray(); // [A, D, C, B, E]

        Arrays.sort(ch1); //[A, B, C, D, E]
        Arrays.sort(ch2); //[A, B, C, D, E]

        boolean r1 = Arrays.equals(ch1, ch2); // true ( better assign to a boolean first
        System.out.println(r1);

        System.out.println(Arrays.equals(ch1, ch2)); //true

        System.out.println("==============================");


        String sentence = "I Love Programming Language";

        String[] words =  sentence.split(" ");  // {I, Love, Programming, Language}
        System.out.println( Arrays.toString(words)  );

        for(int i = words.length-1; i >= 0; i-- ){  //to print in descending order
            System.out.print(words[i]+" ");
        }
        System.out.println();


        System.out.println("=====================================");

        String s = "JAV@A";

        String[] arr =  s.split("@");  // every single single elements are STRING
        System.out.println(Arrays.toString(arr)); //    JAV , A

        char[] c = s.toCharArray(); // every single single elements are CHAR values
        System.out.println(Arrays.toString(c));






    }
}
