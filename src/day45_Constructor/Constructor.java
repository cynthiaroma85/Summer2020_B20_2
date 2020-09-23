package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    // we can have MORE than 1 constructor with overloading
    public Constructor(){
        System.out.println("No argument");
    }

    public Constructor(int a){
        System.out.println(" with int argum");
    }


    public Constructor(String a){
        System.out.println("String Arguments");
    }

    public Constructor(int a, int b){
        System.out.println(" with 2 int argum");
    }

    public static void main(String[] args) {

      // Constructor obj1=new Constructor();
      //  Constructor obj3=new Constructor("apple");
        // constructor will only GET EXECUTED if/when we Create the OBJECT
        // this constructor will only PRINT! because we USED the INT with argument!!
        Constructor obj2=new Constructor(10);


        ArrayList<Integer> list1=new ArrayList<>(); // this will use the default constructor
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2=new ArrayList<>(list1);// since is a constructor we can pass values
      //
        // list2.addAll(Arrays.asList(list1));
        System.out.println(list2);  //[1, 2, 3, 4, 5]



    }



}
