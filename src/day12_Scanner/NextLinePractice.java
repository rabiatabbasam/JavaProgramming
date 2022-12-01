package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Enter

        System.out.println("Enter your age");
        int age = scan.nextInt();//19Enter
        scan.nextLine();//Enter

        System.out.println("Enter your Full Name");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();//3.5 Enter
        scan.nextLine();//Enter

        System.out.println("Enter your School Name");
        String schoolName = scan.nextLine();

                System.out.println("age = " + age);
                System.out.println("fullName = " + fullName);
                System.out.println("gpa = " + gpa);
                System.out.println("schoolName = " + schoolName);



        //scan.nextLine();

         scan.close();














    }






















}
