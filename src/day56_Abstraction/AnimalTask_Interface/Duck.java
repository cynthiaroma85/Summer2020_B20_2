package day56_Abstraction.AnimalTask_Interface;


// Interface(implements) we will only implements the behavior WE NEED!
public class Duck extends Animal implements Swimmable,Flyable,Playable{


   @Override
    public void eat(){
        System.out.println("Duck is eating");
    }

    public void sleep(){
        System.out.println("Duck is sleeping");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swmming");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing");
    }

}
