package day44_Constructor;
/*
declare:
			 Access-Modifier  className(Parameters){
			 		statements;
			 }
 */
public class ConstructorIntro {


    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
    }


    public static void main(String[] args) {

        //    ConstructorIntro obj = new ConstructorIntro(10);

        //  ConstructorIntro obj2 =  new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar");
        //if we create a constructor with parameter(extra ifo need it to run the method)
       // we must add the argument

        //there always will be a constructor sometimes with no parameter


    }

}
