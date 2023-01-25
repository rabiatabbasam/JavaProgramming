package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array

        BiPredicate<Integer[], Integer> contains = (a, b)-> {
           boolean result = false;

            for (Integer each : a) {
                if(each==b){
                    result = true;
                    break;
                }
            }

            return true;

        };

        Integer[] arr = {1,2,3,4,5,67,8,9,10};
      boolean r1 =contains.test(arr,11);

        System.out.println(r1);

        System.out.println("-------------------------");

        //Create a function that can check if two strings are anagram

        BiPredicate<String, String> anagram = (a, b) -> {
       String[] arr1 = a.split("");
       String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };















    }
}
