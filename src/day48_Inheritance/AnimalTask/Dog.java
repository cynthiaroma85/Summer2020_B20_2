package day48_Inheritance.AnimalTask;

// if Dog is an animal we can apply onheritance
// so now Dog will became a SUB_CLASS and ANimal will be a SUPER CLASS (ALSO INHERITANCE)
// BY creating this relationship:
// the Dog(subclass) will inheritance all the variables(attributes) from SUperClass
// with a subclass we will have less coding and it will be more READABLE/ efficient

public class Dog extends Animal{
   //      sub(child)    super(parent)

    // in the subclass YES we can create a CONSTRUCTOR
    public Dog(String name, String size,int age,char gender,String breed,double weight){
        setInfo(name,size,age,gender,breed,weight);

    }


   public void bark(){
       System.out.println(name+" is barking");
   }





    }

