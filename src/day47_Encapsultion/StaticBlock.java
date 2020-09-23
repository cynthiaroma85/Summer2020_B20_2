package day47_Encapsultion;

import java.util.ArrayList;

public class StaticBlock {

    // we can initialize here as long as it will take ONE STEP
    static String companyName="Bank of America";
    static ArrayList<Integer> list;

    static{  // once class is loaded < Static block will run First and only ONE TIME
    list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    }

    public static void main(String[] args) {
        System.out.println(companyName);
        System.out.println(list);

    }







}
