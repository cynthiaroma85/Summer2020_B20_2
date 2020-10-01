package day58_Polymorphism.AnimalTask;

public class Zoo {

    // In polymorphis ONLy the override method GEt EXECUTED!
    // Object type decides what will be executed , if its iverride then the object, OTHErWISE the Superclass
    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston",4, 'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println( dog1.dogName );
        System.out.println(dog1.age );
        System.out.println(dog1.gender);

        System.out.println("=====================================");


        Animal animal1= new Dog("Grizz", 4, 'M');
        animal1.sleep();
        animal1.eat();
       // animal1.bark(); // canot be callled because its not in the REFERENCE type


        // System.out.println(animal1.dogName);
        System.out.println(animal1.age);
        System.out.println(animal1.gender);

        System.out.println(animal1);





    }
}
