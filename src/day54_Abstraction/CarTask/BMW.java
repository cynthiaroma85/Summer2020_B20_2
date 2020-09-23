package day54_Abstraction.CarTask;



public class BMW extends Car{

    // can not create an object from abstract class so
// whenever an abstract class is extended, must OVERRIDE this method( visibility same or more)
   // only instance Method can be overriding! Return type sam! add only implementation
    @Override
    public void start() {
        System.out.println("Starting BWM by: push start button");
    }

}
