package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {

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

        //1.1 who has the maximum salary
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;

            }
        }

        System.out.println(name1);

















    }
}
