package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " Is Even Number");
            } else {
                System.out.println(num + " Is Odd Number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();//No

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println(" please re enter, Would you like to enter another number");
                a = scan.next().toLowerCase();

                if (a.equals("no")) {
                    break;
                }
               scan.close();
            }


        }

    }
}



















































