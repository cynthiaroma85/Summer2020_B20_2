package day50__Inheritance_Overriding.CarTask;

public class CarObjects {

    //overrading : create just ONE METHOD with different implementation
    // advantages: less coding, less MEMORY, reusable,
    // same method NAME so easy to memorize , also
    // very FLEXIBLE : IT will only EXECUTE THAT SPECIFIC IMPLEMENTATION

    public static void main(String[] args) {

        Honda honda = new Honda();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
        Jeep jeep = new Jeep();



        honda.start();// same like Car implementation // becasue of method overriding
        // only ONE method will get executed depending the object is calling
        System.out.println("================================");
        mercedes.start(); //push the star botton
        System.out.println("==================================");
        tesla.start();  // voice control
        System.out.println("===================================");
        jeep.start();



    }



}
