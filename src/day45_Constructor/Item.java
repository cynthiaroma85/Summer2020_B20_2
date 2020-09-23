package day45_Constructor;
/*
 1. create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

    // CONSTRUCTOR method to initialize the 3 Instances,(CONS method name ==class name)
    // also we need to pass Argument to the parameter( to initialize instance variables
    public Item( String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity; // this to Name local variables SAme like instance variable
    }

     // we need and INSTANCE method because we will use inst variables
     public double calCost(){  // i dont need variables because i already declared the variables
        return unitPrice*quantity;
     }

     // toString Method compiler will automatically executed everyTime we pass the object!
     public String toString(){
         return "Name: "+ name+", Unit Price: "+unitPrice + ", Quantity: "+quantity+
                 ", Total Price: "+calCost();

     }







}
