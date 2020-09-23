package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        String[] names = {"Odina", "Liliia", "Berk", "Emine"};

        Arrays.sort(names); // alphabetical order [Berk, Emine, Liliia, Odina]

        System.out.println(Arrays.toString(names));

        int[] score = {80,75, 65, 110, 90, 45, 56, 78};

        Arrays.sort(score);  // put it in Ascending order
        System.out.println(Arrays.toString(score));  //  [45, 56, 65, 75, 78, 80, 90, 110]

        System.out.println("Maximum: " + score[ score.length-1 ]);
        System.out.println("Minimum: "+score[0]);

        System.out.println("=======================================");

        String[] s1 = {"A", "Practice", "C"};
        String[] s2 = {"A", "Practice", "C"};

        System.out.println(    Arrays.equals(s1, s2)       );

        String[] s3 = {"C", "A", "Practice"};
        System.out.println(  Arrays.equals(s1, s3) ); // false



        String[] a1 = {"A", "C", "Practice"};
        String[] a2 = {"Practice", "A", "C"};

        Arrays.sort(a1); // a1: {A, B, C};
        Arrays.sort(a2); // a2: {A, B, C};

        System.out.println(  Arrays.equals(a1, a2) ); // once sort and SAME : TRUE

        String w1 =  Arrays.toString(a1);
        System.out.println(w1);




    }
}
