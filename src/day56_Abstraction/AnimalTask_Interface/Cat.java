package day56_Abstraction.AnimalTask_Interface;

// first class Is a relationship extends (Inheritance)
public class Cat extends Animal implements Playable {
                                // to implement play method action!
    @Override
    public void eat(){
        System.out.println(" Cat is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }


}
