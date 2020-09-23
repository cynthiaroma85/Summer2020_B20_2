package Office_Hours.practice_miscelanious;

import java.util.ArrayList;

public class PizzaObjects {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForBatch20=new ArrayList<>();

        for(int i=0; i<=400;i++){

            Pizza  myPizza=new Pizza();
            myPizza.setPizzaInfo("Large",2,2);
            pizzaForBatch20.add(myPizza);
        }


    //    System.out.println(myPizza); // because we create already the TOSTRING the info will
                                     // automatically be printed!

    }


}

