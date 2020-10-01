package Office_Hours.practice_09_23_2020;

public abstract class Shape {

    public double area;
    public  double perimeter;
    public double volume;

    // abstract method can have different RETURN type, buit when override =same returntyoe
    // access modifier when implemented must be same or more visible
    public abstract double calculateArea();
    public abstract double calculatePerimeter();



   /* //constructor to initialized area and perimeter
    // however i dont have enough info to calculate the area or perimeter

    public Shape(){
        area = calculateArea();
        perimeter = calculatePerimeter();
    }*/




}
