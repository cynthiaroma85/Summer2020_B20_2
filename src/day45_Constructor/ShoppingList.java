package day45_Constructor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

/*
  create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

 */
public class ShoppingList {
    public static void main(String[] args) {

       // creating object:
      Item item1=new Item("oranges",2.1,2);
      Item item2=new Item("apples",1.20,4);
      Item item3=new Item("eggs",1.1,1);
      Item item4=new Item("milk",3.20,4);
      Item item5=new Item("bananas",1.1,3);

      ArrayList<Item> groceries=new ArrayList<>();
      groceries.addAll(Arrays.asList(item1,item2,item3,item4,item5));
      //groceries.removeIf(p-> p.unitPrice>2);
        System.out.println(groceries.size());


        double totalCost=0;  // create a local variable to claculate total Price
        for (Item each:groceries) {
            totalCost+=each.calCost(); // calCost is an INSTANCE method and it belongs to the object
                                       // so we can call it
        }
        System.out.println(totalCost);//  26.2


        System.out.println("=======================");


        Item[] items={item1,item2,item3,item4,item5}; // Calculate totalcost using ARRAY
        double totalCost2=0;
        for(int i=0;i<items.length;i++){
            totalCost2+=items[i].calCost();
        }
        System.out.println(totalCost2);




    }


}
