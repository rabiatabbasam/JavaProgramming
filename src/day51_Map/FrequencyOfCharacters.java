package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //Write a program that can return the frequency of characters
        //Ex: str = "bbcccaaaaa"
        //         bca
        //         235

        String str ="bbcccaaaaa";
        //Collections.frequency();
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {//each: characters of string
           int frequency = Collections.frequency(Arrays.asList(arr), each);
            // result.put(each, Collections.frequency(Arrays.asList(arr), each));
            result.put(each, frequency);
        }

        System.out.println(result);





















    }
}
