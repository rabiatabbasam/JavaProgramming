package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Full Name");
           String fullName = scan.nextLine();//java ProgrammingEnter

        System.out.println("Enter your building Number");
        String building = scan.next();//7925AEnter
        scan.nextLine();//Enter

        System.out.println("Enter your street name");
       String street = scan.nextLine();//Jones Branch DriveEnter

        System.out.println("Enter your city name:");
       String city = scan.nextLine();//McLeanEnter

        System.out.println("Enter your state");
        String state = scan.next();//VAEnter


        System.out.println("Enter your zip code");
    String zipCode = scan.next();//22012Enter
       scan.nextLine();

        System.out.println("Enter your country name");
       String country= scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);



scan.close();




    }















}
