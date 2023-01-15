package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden spoon", "Book","Pen", "Phone", "Wooden spoon",
        "Wooden spoon", "Wooden spoon", "Wooden spoon", "Milk", "Eggs", "Coke", "Paper towels"};

      arr = new HashSet<>(Arrays.asList(arr) ).toArray(new String[0]);



        /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
      arr = set1.toArray(new String[0]);

        System.out.println(set1);
*/

        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,3020,10));

       list = new ArrayList<>( new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        String[] array = {"A", "B", "B", "C"};
        List<String> s = new ArrayList<>( Arrays.asList(array) );

        s.addAll(Arrays.asList("E", "F", "G") );

        System.out.println("----------------------------------");

        Integer[] nums = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums) ).toArray(new Integer[0] );

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        //abcde
        //54434

        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
        result += each + Collections.frequency(Arrays.asList(str.split("")),each);

        }
        System.out.println(result);





    }


}
