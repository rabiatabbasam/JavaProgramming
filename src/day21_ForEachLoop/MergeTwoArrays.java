package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Leyan", "Aysenur"};//3
        String[] group2 = {"Maria", "Aygun", "Dutgu", "Suat", "Valeriy"};//5

        String[] students = new String[group1.length + group2.length];//8
     int i = 0;


        for (String each : group1) {//Ali,Lyan,Aysenur
     students[i++]  = each;

        }

        for (String each : group2) {
        students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------");

      String[] word1 = {"Java", "Programming"};
      String [] word2 = {"Cydeo", "C#", "Python"};

      String[] result =new String[word1.length + word2.length];

      int j = 0;

        for (String each : word1) {
           result[j++] = each;
        }
        for (String each : word2) {
           result[j++] = each;
        }

        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D','E','F','G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int k = 0;
        for (char ch : ch1) {
         chars[k]  = ch;
        k++;
        }
        for (char c  : ch2) {
           chars[k] = c;
        k++;
        }

        System.out.println(Arrays.toString(chars));








    }



















}
