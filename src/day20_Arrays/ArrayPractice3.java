package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();//5

        if (length <= 0) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int[] numbers = new int[length];// aray needs to have enough capacity to contain all the elements usr going

        for (int i = 0; i < length; i++) {//i: 0, 1
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();// each input user provided during each execution of th loop,will be assigned to index

        }


        System.out.println(Arrays.toString(numbers));

        scan.close();







    }
}