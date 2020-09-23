package day56_Abstraction.AnimalTask_Interface;

//abstract only to store common features
// iNterface for especial actions or behavior shared only by some classes not all.
//INTERFACE: can Extend 1 class only!, can IMplement multiple Interfaces
//         : objects come from class, so interface CANNOT create objects so NO InSTANCES obj or meth
//       :CANNOT have COnstructor either, neither  Blocks


public abstract class Animal {

    public abstract void eat();
    public abstract void sleep();
}
