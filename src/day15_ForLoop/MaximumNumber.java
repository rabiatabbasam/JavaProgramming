package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;//max = 2// any user entered number will be greater than -2147483648

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");

       int num = scan.nextInt();//1,2,3,4,5//1,2//-10, -20, -30,-15

        if (num> max){//if the user entered number is greater than current maximum number
            max = num;
        }


        }
        System.out.println("max = " + max);

        scan.close();




        /*
        return the maximum number
         */










    }





}
