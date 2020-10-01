package Office_Hours.practice_09_23_2020;

public class Square extends Shape {
    // subclasses MUST to override ALL abstract methods from superClass
public double side;


// constructor to initialize
    public Square(double side) {
        if(side<=0){                   // throe an argument to know the reason of Throw key word
            throw new RuntimeException("Side of square cannot be negative or zero");
        }

        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    // override: same <more visible acces modifier/same return type/same method name
    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}

