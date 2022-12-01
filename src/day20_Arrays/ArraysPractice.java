package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store teh elements: 10,20,50,70

        int[] numbers = {10, 20, 50, 70};// size: 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------");
     // create a variable that contain 5 scores

        int[] scores = new int[5];//
        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));//[65, 85, 55, 75, 95]

        System.out.println("------------------------------------");

     String[] month = {"January", "February", "March","April", "May","June", "July",
             "August", "September", "October", "November","December"};//0 ~ 11(length - 1)
     /*
        System.out.println(month[0]);// Jan
        System.out.println(month[1]);// Feb
        System.out.println(month[2]);// Mar
        System.out.println(month[3]);// Apr
        System.out.println(month[4]);// May
        System.out.println(month[5]);// Jun
        System.out.println(month[6]);// Jul
        System.out.println(month[7]);// Aug
        System.out.println(month[8]);// Sep
        System.out.println(month[9]);// Oct
        System.out.println(month[10]);// Nov
        System.out.println(month[11]);// Dec
      */

        for (int i = 0; i < month.length ; i++) {// i: represents the index numbers of array starting from 0
            System.out.println(month[i]);
        }

        System.out.println("--------------------------------");

        for (int i = month.length-1; i >=0 ; i--) {// i: represents the index numbers of array starting from last index
            System.out.println(month[i]);
        }







    }





















}
