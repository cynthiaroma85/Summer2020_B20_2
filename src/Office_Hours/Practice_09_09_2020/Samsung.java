package Office_Hours.Practice_09_09_2020;

public class Samsung extends  Phone{
    /*inheretance   variables 4
                    methods 3
     */
    public Samsung(String model, double price) {  //constructor to initialize instance variables
        super(model, price); // only constructor can call another constructor
    }


    static {
        brand="Samsung";
        madeIn="Korea";
    }


    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung"+model+" is calling"+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Samsung"+model+" is texting"+ phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
