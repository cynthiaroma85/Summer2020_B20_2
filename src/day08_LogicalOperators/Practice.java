package day08_LogicalOperators;

public class Practice {


        public static void main(String[] args) {
            String firstName = "Cynthia";
            String lastName = "Romani";
            int age = 30;
            String citizenShip = "Peru";

            boolean eligibleToVote = age >= 18  && citizenShip == "USA";
            //                       19 >= 18   &&  "USA" == "USA"
            //                         true    &&    true

            String fullName = firstName + " " + lastName;
            System.out.println(fullName+" is eligible to vote: " + eligibleToVote );
            // Aaron Daniel is eligible to vote: true

        }
    }



