package Office_Hours.practice_09_23_2020;

// extends must override abstract methods as soon as its extended(inherted)
// INTERFACE:implementation (its not a class) only if its need it
public class Cube extends Shape implements Volume{

    //area, perimeter, volume
    public double side;

    public Cube(double side){
        if(side <= 0 ){
            throw new RuntimeException("Cube side can't be negative or 0");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }


    @Override
    public double calculateArea() {
        return Math.pow(side,2)*6;
    }

    @Override
    public double calculatePerimeter() {
        return side*12;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }

}
