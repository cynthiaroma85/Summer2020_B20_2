package day44_Constructor;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Meerin", 20, 'F');
        //Since Student(); is a constructor method with parameter
        // now we can just Initialize the objects in the parameter

        Student student2 = new Student("Nickolas", 21, 'M');
        // so now we dont need the SETiNfo

        Student student3 = new Student("Murat", 22, 'M');

        System.out.println(student1);// Name: Meerin, Age: 20, Gender: F, School Name: Cybertek University
        System.out.println(student2);
        System.out.println(student3);
    }


}
