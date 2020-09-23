package day48_Inheritance.AnimalTask;


public class Animal {
    //public is Acces mofidier that will make it seeit everywhere
    // super class becasue all animals will share this characteristics
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;
    public double weight;

    //contructor wonr be inheritance because name have to be the same like className
    //constructor is executed whenever we create the object
    // so i need to use setInfo method , because setInfo method can be inheritance
    public void setInfo(String name, String size,int age,char gender,String breed,double weight){
      this.name=name;
       this.size=size;
        this.age=age;
       this.gender=gender;
       this.breed=breed;
       this.weight=weight;


    }

    //create actions in methods
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString(){
        return "Name: "+name+", age: "+age+", SIze: "+size+", Gender: "+gender+" Breed: "+breed+" Weight: "+weight;
    }




}
