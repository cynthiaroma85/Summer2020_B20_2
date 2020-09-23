package day51_Exceptions;

// OVERRIDING happens in a SUBCLASS onLY!

class A {

    protected void method(){
    }
}


public class methodOverriding extends A {
/*
    @Override  // if there is compile error then is not overrided
    public int method(){
        return 10;
    }
 */


    @Override
    public void method(){

    }


    @Override  // only for Subclasses
    // toString is from Java.lang package so we can override it!
    // its implicited done
    public String toString(){
        return "example";
    }



}
