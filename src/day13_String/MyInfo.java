package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//EnterEnter

        System.out.println("Enter your age");
        int age = scan.nextInt();//19Enter

        System.out.println("Enter your gender");
        String gender = scan.next();//MaleEnter

        scan.nextLine();//EnterEnter

        System.out.println("Enter your full name");

        String fullName = scan.nextLine();//if the previous scanner method that's used is not nextLine(), then we need to provide one more nextLine()

        System.out.println("Enter your phone number");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("FullName: = " + fullName);
        System.out.println("Age: = " + age);
        System.out.println("Gender: = " + gender);
        System.out.println("Phone number: = " + phone);
        System.out.println("Address: \n\t"+buildingNumber+" "+street+"\n\t"+cityName+", "+stateName+" "+zipCode);
        System.out.println("School name: = " + schoolName);










    }

















}
