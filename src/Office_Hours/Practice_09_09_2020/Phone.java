package Office_Hours.Practice_09_09_2020;
/*

Phone: brand, model, price, madeIn, call(), text()
    static: brand, madeIn
    insatnce: model, price, call(), text(), toString()

 */
public class Phone {

    public static String brand;
    public static String madeIn;
    public String model;
    public double price;
// inheritance easy to manytein and REUSABlE
    // if isnot default constructor MUST be called in other classes.
    // constructor must have SAME NAME like the CLASS
    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }


    protected void call(long phoneNumber){  // void because nothing is return
        System.out.println("Phone is calling"+phoneNumber);
    }


   protected void text(long phoneNumber){
        System.out.println("Phone is texting"+ phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone: " +
                "model: " + model + '\'' +
                ", price: $" + price;
    }







}
