package Library;

import com.sun.org.apache.xpath.internal.operations.Variable;
import day47_Encapsultion.AccessModifiers;

public class Test_AccessModifiers {


    public static void main(String[] args) {
                          // className.method/variable
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod(); // public visible everywhere but not secure

      //  System.out.println(AccessModifiers.defaultVAriable);
        // default is not accesible outside the package
      //  only visible between the same package

      //  System.out.println(AccessModifiers.privateVariable);// private is not visible outside its class
       // AccessModifiers.privateMethod(); //
    }





}
