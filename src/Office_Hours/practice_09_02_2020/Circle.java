package Office_Hours.practice_09_02_2020;

public class Circle {

    public double radius;
    public double diameter;
    public static  double PI;  //PI=3.14; we can also initialize it here since its static!
    public double area;
    public double perimeter;

    static {         // better initialized in STATIC BLOCK!!! more efficiente! RUN 1 time ONLY!
        PI=3.14;
    }

    // constructor same name like CLass // to initialize instances variables
    public Circle(double radius){   // we just need the RADIOUS
        this.radius=radius;// this because local variable since is same like instance
        // we need PI info before AREA and perimeter calcuLATION
       // PI=3.14;  // better tp initialized in STATIC BLOCK!!! more efficiente
        this.diameter=2*radius;
        area=calculateArea();  // using a variabke instead of method
        perimeter=calculatePerimeter();
    }


    //instance method, if we will use the instance variables
    //   private double calculateArea(){ // PRIVATE for internal use only// only visbe in this class
    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }


    public String toString(){
        return "Radious: "+radius+", Diameter: "+diameter+", Area: "+area+", Perimeter: "+perimeter;
    }













}




