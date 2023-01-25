package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
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

        System.out.println("-----------------------------");
       //Create a function that can print the given string for given number of times

        BiConsumer<String, Integer> printMultipleTimes = (s, n) ->{
            for (int i = 0; i < n; i++) {
                System.out.println(s);

            }
        };


        printMultipleTimes.accept("Java", 5);

        //Create a function that takes first and last names and prints the formatted full name

        //"jAvA", "PROGRAMMING" -----> Java programming

        System.out.println("----------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
       /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k+" : "+v);

        }
        */

        scrumTeam1.forEach( (k, v)->System.out.println(k+" : "+v) );

        System.out.println("-------------------------------------");

        //1. Create a function that takes two integers and returns the maximum integers

        BiFunction<Integer, Integer, Integer> maxNum = (a,b)->(a>b)?a:b;

       int max =  maxNum.apply(100,200);

        System.out.println(max);

        //2. Create a function that can merge two integers arrays into list

        BiFunction<int[], int[], List<Integer>> merge = (x,y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) result.add(each);

            for(int each: y) result.add(each);

            return  result;

        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1,arr2);

        System.out.println("------------------------------------");

        //Create a function that takes a list of String and a list of integer

        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100,110}

        map ==> {Josh= 100, Daniel = 110}
         */

        BiFunction<List<String>, List<Integer>,Map<String, Integer>> merge2 = (j, k) -> {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));

            }
            return map;
        };

       List<String> names= new ArrayList<>(Arrays.asList("Layan","Kseniia","aygun"));

       List<Integer> scores = new ArrayList<>(Arrays.asList(90,95,98));

       Map<String,Integer> students= merge2.apply(names,scores);

        System.out.println(students);


















    }
}
