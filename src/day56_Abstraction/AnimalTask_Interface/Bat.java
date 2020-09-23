package day56_Abstraction.AnimalTask_Interface;


//INTERFANCE: can Extend 1 class only!, can IMplement multiple Interfaces
//         : objects come from class, so interface CANNOT create objects so NO InSTANCES obj or meth
//       :CANNOT have COnstructor either, neither  Blocks
//       its Abstract, so need to be visible to be implemented ( ny default ,its public)


public class Bat extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Bat is sleeping");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }






}
