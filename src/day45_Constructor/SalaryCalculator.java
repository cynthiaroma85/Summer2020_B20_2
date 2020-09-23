package day45_Constructor;
/*
 2. Create class called SalaryCalculator
             instance variables:
              hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
              add a constructor can initialize those fields
         instance methods:
         salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48
          stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
           federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
           salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
         toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
   double stateTaxRate;
   double federalTaxRate;

   // Mainly use constructor to initialize the instances;

///right click:Generate -- Constructor--
    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate,
                            double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }


    public double salary(){
        return hourlyRate*weeklyHours*48; // *48 for the year
    }

    public double stateTax(){ return salary()*stateTaxRate; }

    public double federalTax(){ return salary()*federalTaxRate; }

    public double salaryAfterTax(){ return salary()-stateTax()-federalTax(); }

    //toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
    public String toString(){
        return "Salary: "+salary()+" \nState Tax: "+stateTax()+"\n Federal Tax: "
                +federalTax()+"\nSalary after Tax: "+salaryAfterTax();
    }



}
