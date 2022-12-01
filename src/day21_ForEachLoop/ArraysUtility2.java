package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String [] earlyBirds = Arrays.copyOf(students,5);//always copy of elements

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
       numbers = Arrays.copyOf(numbers,5);//{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


        int[]scores = {85,90,97,89,10};
        scores = Arrays.copyOf(scores,2);

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------------");

     char[] ch1 = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H','I'};
     char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);

        System.out.println(Arrays.toString(ch2));


     int[] scores1 = {10,20,30,40,50,60,70,80,90,100};
    // index:         0  1   2  3  4  5 6 7 8 9
         int[] result = Arrays.copyOfRange(scores1,3,7+1);

        System.out.println(Arrays.toString(result));


        int[] result2 = Arrays.copyOfRange(scores1,5,scores1.length);
        System.out.println(Arrays.toString(result2));





    }


























}
