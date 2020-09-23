package Office_Hours.Practice_09_09_2020;

public class PhoneShop {


    public static void main(String[] args) {

        Iphone iphone=new Iphone("11 Pro", 1000);  // creating object
        iphone.call(911); // because we overriding it will print the new implementation
        iphone.text(123456);
        System.out.println(iphone); // because we didnt override it will print from SUPERclass





    }



}
