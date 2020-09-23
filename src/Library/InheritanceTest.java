package Library;

import day50__Inheritance_Overriding.AccessModifiers;

// in order to inherit AccesModifier class will will extend it ( so it will be like a grandchild
public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData); // public is visible outside package
        System.out.println(InheritanceTest.protectedData); // protected is visible always visible to any sub class
        //   System.out.println(InheritanceTest.defaultData); // default is not visible outside package


    }





}
