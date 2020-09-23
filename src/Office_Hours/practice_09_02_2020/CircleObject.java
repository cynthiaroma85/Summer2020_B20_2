package Office_Hours.practice_09_02_2020;

public class CircleObject {

    public static void main(String[] args) {
        // Circle circle1 = new Circle();
        // there is notDEFAULT constructor since we already created one? and need Argument:

        Circle circle1 = new Circle(3);

        System.out.println("Circle radious: "+ circle1.radius);  // 3
        System.out.println("Circle diamete: "+circle1.diameter);  // 6
        System.out.println("Circle's area: "+circle1.calculateArea());
        System.out.println("Circle's area: "+circle1.area); // better to create Variable to skip all steps from Methods!!
        System.out.println("Circle's perimeter: "+circle1.calculatePerimeter());
        System.out.println("Circle's perimeter: "+circle1.perimeter);


        Circle circle2 = new Circle(5);
        // calling instances variables and method through the object:
        System.out.println("Circle radious: "+ circle2.radius); //5
        System.out.println("Circle diamete: "+circle2.diameter); // 10
        System.out.println("Circle's area: "+circle2.area);
        System.out.println("Circle's perimeter: "+circle2.perimeter);

                                     // hash code since we didnt
        System.out.println(circle1);//  Office_Hours.practice_09_02_2020.Circle@61bbe9ba







    }


}
