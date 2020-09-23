package day51_Exceptions;

class X{

    public X() { // Constructor from SuperClass
        System.out.println("X");
    }

}

class Y extends X{
    public Y(){  // constructor
       //  super(); //X
        System.out.println("Y"); // Y
    }
}

class Z extends Y{
    public Z(){  //Constructor
        // super(); // X Y
        System.out.println("Z"); // Z
    }
}


public class Practice {

    public static void main(String[] args) {

        new Z();  // X Y Z

    }




}
