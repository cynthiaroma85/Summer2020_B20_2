package day47_Encapsultion;
/*
task:
    1. create class Credentials
            instance variables:
                    public name
                    public age
                    private username
                    private password
                    getter & setter
                    add a constructor to set name & age

 */
public class Credentials {

    public String name;
    public int age;

    private String userName;
    private String password;

    public static String companyName;

    //static shouldnt initialize in the constructor, so better use static block
    // for efficency only 1 time colipe will repeated!!
    static { companyName="Facebook";  }

   // constructor
    public Credentials(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setUserName(String userName){
        this.userName=userName; // this to assign the user name local, to the instance variable
    }

    public void setPassword(String password){
        this.password=password;
    }

// GETTER we want to be able to JUST read the data / also data tapa need to match
    // to generate PRIVATE VARiables data getter and setters!
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }



}
