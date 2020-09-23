package day47_Encapsultion;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj=new Credentials("Mike",34);
      //  obj.userName="cybertek"NOT because its private
        obj.setUserName("Cybertek");
        obj.setPassword("Cybertek12345");

        // now we use GETTER to be able to read or print private data!
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

        // we can access directly to the data because its public...
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);

    }

}
