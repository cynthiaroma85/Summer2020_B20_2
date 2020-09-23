package day54_Abstraction.CarTask;

//ABstract
//Concrete


public class ParkingLot {

    public static void main(String[] args) {
        // we can crete from BMW because is concrete method! not ABtract!
        // we canot create objectd from abstract method
        // has a relation
        // Car car1=New Car();
        BMW bmw= new BMW();
        Tesla tesla=new Tesla();
        Toyota toyota= new Toyota();
        Jeep jeep = new Jeep();


        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();


    }

}
