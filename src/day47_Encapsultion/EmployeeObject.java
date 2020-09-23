package day47_Encapsultion;

public class EmployeeObject {

    public static void main(String[] args) {

        CapitalOneEmployees employee1=new CapitalOneEmployees("Cynthia", 35,"SDTE");

        employee1.setID(123);  // SETTERs to set info of private variable
        employee1.setAddress("Virginia");
        employee1.setSalary(10000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);

        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());  //to print private data we use GETTERS

        System.out.println(employee1);


    }



}
