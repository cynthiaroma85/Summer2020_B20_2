package day26_Multidimensional_Arrays;

import java.util.Arrays;

/*
2. write a program that can return the number of appearances of “java” and “python”
 anywhere in the sentence
            ex: input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python
 */
public class FreqofJavaPhyton {
    public static void main(String[] args) {

        String sentence= "I love Java and Phyton";

        String[] words= sentence.split(" ");// split in between spaces
        System.out.println(Arrays.toString(words)); // [I, love, Java, and, Phyton]

        int countJava=0;
        int countPhython=0;

        for(String each:words){
            if(each.toLowerCase().contains("java")){
                countJava++; //countJava+=1
            }else if(each.toLowerCase().contains("phyton")){
                countPhython++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPhython);
 /*
        str = JavaScript
        str.equals(Java) ==>false
        str.contains("Java") ==> true
         */



    }
}
