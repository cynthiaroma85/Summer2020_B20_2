package day48_Inheritance.AnimalTask;

public class Cat extends Animal{

     /*
    variables: 5
    methods: 5
     */

    public Cat(String name, String size, int age, char gender, String breed, double weight) {
        setInfo(name, size, age, gender,breed,weight);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }




}
