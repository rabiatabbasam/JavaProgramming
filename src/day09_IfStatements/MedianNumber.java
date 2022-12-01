package day09_IfStatements;

import java.util.Arrays;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
            b = 20,
            c = 30;
        // if we have three different number,one must be maximum,one must be minimum, and one must be median



        // output
        // 15 is the median number
        //                  a = 15, b = 10, c = 20 a = 15, c = 10, b = 20

        // in order for a to be the median number
        //1. if c is the maximum number & b is the minimum number, then a is the median number
        // 2. if b is the maximum number & c is the minimum, then a is the median number

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
           // b = 15, a = 20, c = 10  b = 15, a = 10, c = 20
           boolean bIsMedian = (b > c && b < a) || ( b > a && b < c);

           boolean cIsMedian = (!aIsMedian && !bIsMedian);

           if (aIsMedian) {// if a is the median number
           }
               System.out.println(a + " is the median number");

               if (bIsMedian ){ // if b is the median number
                   System.out.println(b + " is the median number");

               }

              if (cIsMedian){ // if c is the median number
                  System.out.println(c + "is the median number ");

              }









    }







}
