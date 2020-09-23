package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone{


    // constructor accept static however is not efficient for compiler
    public Iphone(String model, double price){  //
        super(model, price);  // set the model, price
    }


    static {
        brand="iphone";
        madeIn="USA";
    }
// overriding mjust be same RETURNtype,- parameter same -access modifier same or more visible
// implementation that will be executed will depend of the OBJECT

    @Override
    public void call(long phoneNumber) {
        System.out.println("iphone"+model+" is calling"+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("iphone"+model+" is texting"+ phoneNumber);
    }


}
