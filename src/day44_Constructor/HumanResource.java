package day44_Constructor;
/*
  2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees

 */
public class HumanResource {
    static  Employee employee1;  //we can call it from the class
    static  Employee employee2;
    static  Employee employee3;
    static  Employee employee4;
    static  Employee employee5;

    //employee1=new Employee(); // if to INItialize static variable takes MORE than 2STEPS
   // employee.setEmployeeInfo() // can no do it in main method or class

static {  // as soon as the class is called, the static variables need to be set
         // static block it will be running for ONE TIME only
          // and it can be called from the classname"HumanResource"
    employee1= new Employee();
    employee2= new Employee();
    employee3= new Employee();  //also we initialize in a STATIC Method and NOT in main method
    employee4= new Employee();  //because if we do it at main method we CANNOT called outside the class
    employee5= new Employee();

    employee1.setEmployeeInfo("Muhammed",12312,456432,"SDET",120000,'M');
    employee2.setEmployeeInfo("Erkan",45678,123987,"QA",115000,'M');
    employee3.setEmployeeInfo("Asiya",56431,657098,"Instructor",99000,'F');
    employee4.setEmployeeInfo("Ayse",17876,342567,"SDET",125000,'F');
    employee5.setEmployeeInfo("Ahmet",67543,987654,"Developer",140000,'M');
}


}




