package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        //[1,2,3,4,5,6]

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
       arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);

        int[] nums2 = {1,2,3,4,5,67,8,9,10};
        Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4.stream().map(p-> p * 10).collect(Collectors.toList());

        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));

        days.stream().map(p -> p.substring(0,3) ).collect(Collectors.toList());

        System.out.println(days);

















    }
}
