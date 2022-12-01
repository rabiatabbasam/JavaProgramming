package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {
     // 123Enter


        Scanner scan = new Scanner(System.in);//enter

        System.out.println("Enter your Full Name");
        String  fullName=scan.nextLine();//Wooden spoonEnter

        System.out.println("Enter your programming Language;");
        String  programming=scan.nextLine();//java programming language
        System.out.println("Enter your age");//Enter
        int age = scan.nextInt();// 24Enter
        scan.nextLine();//Enter// capture the entre key that user pressed for nextInt()
        System.out.println("Enter your School Name");
        String schoolName = scan.nextLine();//Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);



  scan.close();






    }











}
