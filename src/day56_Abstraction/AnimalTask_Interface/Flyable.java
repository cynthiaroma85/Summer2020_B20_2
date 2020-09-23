package day56_Abstraction.AnimalTask_Interface;


public interface Flyable {

    boolean hasWings = true;  // by default always PUBLiC for implementation

    abstract void fly();  // by default this is also Public


    class B implements Flyable{
        @Override
        // protected void fly(){}  // CanNOT be only PUBLIC access modifier
        public void fly() {
        }
    }




}
