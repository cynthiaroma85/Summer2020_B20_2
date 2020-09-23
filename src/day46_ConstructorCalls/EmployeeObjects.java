package day46_ConstructorCalls;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee("Cynthia");
        System.out.println(employee1);

        Employee employee2=new Employee("Roman","QA");
        System.out.println(employee2);

        Employee employee3=new Employee("Lillia","SDTE",123456);
        System.out.println(employee3);

        Employee employee4=new Employee("Alexis","SDTE",123456,135000.5);
        System.out.println(employee4);

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(list);
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5));







    }



}
