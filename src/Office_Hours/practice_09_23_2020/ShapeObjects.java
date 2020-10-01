package Office_Hours.practice_09_23_2020;

public class ShapeObjects {

    public static void main(String[] args) {

       // Shape obj1 = new Shape();  cannot create object becaise its a abstract cla
            Square square1 = new Square(10);

            System.out.println( square1.calculateArea() );
            System.out.println(square1.area);
            System.out.println(square1.perimeter);
            System.out.println(square1.calculatePerimeter());
            System.out.println(square1);

            System.out.println("==============================");

            Cube cube1 = new Cube(10);
            System.out.println(cube1.area);
            System.out.println(cube1.perimeter);
            System.out.println(cube1.volume);

            System.out.println(cube1);
    }


}
