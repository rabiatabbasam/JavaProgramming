package day51_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John",123000);
        map.put("Antony",100000);
        map.put("Jimmy",115000);
        map.put("James",110000);
        map.put("Conor",85000);
        map.put("Josh",118000);
        map.put("Cory",125000);
        map.put("Anderson",135000);
        map.put("Steven",117000);

        // displays the names of all employees who has the maximum salaries
     /*
        int maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {

            if(eachValue > maxSalary){
                maxSalary = eachValue;


            }
        }
*/

        int maxSalary = Collections.max(map.values());


    //    int maxSalary = Integer.MIN_VALUE;
        System.out.println("maxSalary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println(pair.getKey());

            }

        }





    }
}
