package day51_Exceptions.PetsTask;

public class Cat extends Pet{


// we Must Called constructor with same Parameters from SuperClass also have one
    public Cat(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color); // super() keyword to call SuperClass Constructor
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }







}
