package day50__Inheritance_Overriding.ShapeTask;


public class Circle extends Shape{

    public double radius;
    public double diameter;
    public static double PI=3.14;  // since it cvan be initialized in ONE step we can do it here!

public Circle(double radius){  //constructor
    this.radius=radius;
    diameter=radius*2;
    area = calculateArea();  //radius*radius*PI;
    perimeter = calculatePerimeter();  //diameter*PI;
}

    public double calculateArea(){   // overriding same methodName sameParameter // different implementation
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }




}
