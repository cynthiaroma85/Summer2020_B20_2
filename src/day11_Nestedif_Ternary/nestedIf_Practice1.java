package day11_Nestedif_Ternary;

public class nestedIf_Practice1 {

    // task: minum salary 30K
    //       suconddition  minimun 2 year job history

    public static void main(String[] args) {

        double salary = 120000;
        int jobHistory=5; // double


            if(salary >= 30000){

                if(jobHistory >= 2){
                    System.out.println("You are qualified");
                }else{ // jobHistory < 2
                    System.out.println("You must have been on job at least 2 year");
                }

            }else{
                System.out.println("You MUST earn at least $30K");
            }






    }


}
