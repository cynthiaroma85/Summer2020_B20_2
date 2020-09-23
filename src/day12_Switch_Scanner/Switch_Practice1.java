package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {


            int num = 4;
            String result = "";

            switch(num){
                case 1:
                    result = "Monday";


                case 2:
                    result = "Tuesday";


                case 3:
                    result = "Wednesday";


                case 4:
                    result = "Thursday";


                case 5:
                    result = "Friday";

                case 6:
                    result = "Saturday";
                    break;

                case 7:
                    result = "Sunday";
                    break;

                default:
                    result = "Invalid";

            }


            System.out.println(result);




        }


}
