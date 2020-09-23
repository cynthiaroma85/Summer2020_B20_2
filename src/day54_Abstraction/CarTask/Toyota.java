package day54_Abstraction.CarTask;


public class Toyota extends Car{

    @Override
    public void start() {  // MANDATORY override the abstrad method in superclass
        System.out.println("Starting Toyota by: Inserting the key");
    }



}
