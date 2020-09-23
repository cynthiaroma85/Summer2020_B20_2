package day50__Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle= new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.area);


        Rectangle rectangle = new Rectangle(3,4);

        System.out.println( rectangle.calculateArea() ); //12

        System.out.println( circle.calculatePerimeter() );   //18.84

        System.out.println(rectangle.calculatePerimeter());  // 14.0






    }



}
