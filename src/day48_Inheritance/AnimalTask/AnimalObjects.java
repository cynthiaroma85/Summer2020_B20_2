package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        // so now whenever we create an obejct with a subclass its MANDATORY to pass all arguments
        Dog dog1=new Dog("Toby", "medium",1,'M',"shitzu",2.1);// create object

        System.out.println(dog1.name); // null
        System.out.println(dog1.size); // nulll

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
       System.out.println(dog1.gender); // gender need to in superclassAnimal since all animal share this


        Cat cat1=new Cat("Pancho","small",1,'M',"angora",2.2);





    }
}
