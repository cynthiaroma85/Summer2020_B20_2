package day56_Abstraction.AnimalTask_Interface;


// as soon as extends abstract and IMPLEMENT Its MANDATORY to Override
public class Parrot extends Animal implements Flyable, Playable, Talk{

    @Override
    public void eat(){
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    public void play(){
        System.out.println("Parrot is playing");
    }


    public void talk(){
        System.out.println("Parrot is talking");
    }



}
