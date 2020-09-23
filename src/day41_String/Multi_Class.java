package day41_String;
// if u sharing CODE FRAGMENT in the selenium
// only ONE class can be public
// and same name with file name

public class Multi_Class {
    public static void main(String[] args) {   // custom class ONLY ONE must be public
                                               // so we can run it everywhere
        System.out.println("Class 1");
    }

}

class test1{
    public static void main(String[] args) {
        System.out.println("Class 2");
    }
}

class test2{
    public static void main(String[] args) {

        System.out.println("Class 3");
    }
}