package day08_IfStatements;

public class SalaryCaculator {

    public static void main(String[] args) {


        int hourlyRate = 65,
          weeklyHour = 40;

        double stateTaxRate = 0,
               federalTaxRate = 26.2;

        //------------------------
        int salaryBeforeTax = hourlyRate * weeklyHour * 52;// salary is equal to one week salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $" + salaryBeforeTax );
        System.out.println("stateTax = $ " + stateTax);
        System.out.println("federalTax = $ " + federalTax);
        System.out.println("totalTax =  $ " + totalTax);
        System.out.println(" Net income = $ " + salaryAfterTax);













    }










}

