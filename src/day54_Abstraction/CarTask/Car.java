package day54_Abstraction.CarTask;

// 1WAY: making SuperClass also Abstract to implemente it in SUB class
// abstract class meant to be SUPERclass and cannot be FINAL class.
// because final class it meant to be subclass only!!  also must be able to be Inhere
// not concrete ( can not create an object
public abstract class Car {

    public Car() { }
    //ABSTRACT method, method without Body! Ignore all details// action
    public abstract void start();

}


    final class A{  // can be final
     }


    class B{
        public static void main(String[] args) {
            A obj1 = new A();
            //  Car obj2 = new Car();
        }
}
