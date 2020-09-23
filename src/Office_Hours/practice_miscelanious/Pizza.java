package Office_Hours.practice_miscelanious;

public class Pizza {
    String size;
    int numberCheeseTopping;
    int numberPepperoniTopping;

    public void setPizzaInfo( String size, int numberCheeseTopping, int numberPepperoniTopping){
        this.size=size;
     this.numberCheeseTopping=numberCheeseTopping;
     this.numberPepperoniTopping=numberPepperoniTopping;
    }


    public double calPrice(){   // whenever we use RETURN no void anymore!
        int totalNumberOfTopping=numberCheeseTopping+numberPepperoniTopping;
        double totalPriceOfTopping=totalNumberOfTopping*2;
        double totalPrice=0;
        if(size.equalsIgnoreCase("small")){
           totalPrice+=10;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice+=12;
        }else{
            totalPrice+=14;
        }
        return totalPrice;
    }


    public String toString(){ // to make it a return value

        return "Size: "+size+"\nNumber of Cheese Topping: "+numberCheeseTopping+
                "\nNumber of Pepperoni Tooping"+numberPepperoniTopping+
                "\n Total Price: "+calPrice();
    }



}

