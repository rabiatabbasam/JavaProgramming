package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 100;


        //System.out.println(" Odd Number");
        //System.out.println(" Even Number");

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;
        if (evenNumber) {  // true

            System.out.println(number + " is even number");
        }

        if (oddNumber) { // odd number// false

            System.out.println(number + " is odd number");
        }

        System.out.println("-------------------------");

        int n = 200;

        // positive
        if (n > 0) {
            System.out.println(n + " is positive");
        }
        // negative
        if (n < 0){
            System.out.println(n + " is negative");
        }
        if (n == 0){
            System.out.println(n + " is zero");
        }
        // zero

















    }
}