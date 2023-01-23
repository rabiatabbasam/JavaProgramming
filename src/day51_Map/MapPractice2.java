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

        //1.1.2 who has the maximum and minimum salary?
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;

            }
            if(eachValue < minSalary){
                minSalary = eachValue;
                name2 = eachKey;
            }
        }

        System.out.println(name1);
        System.out.println(name2);

        System.out.println("-------------------------------------------");

        //1.3 how many employees has the salary between $120k  ~ 150k?

        int count = 0;
        for (Integer eachValue : map.values()) {
            if(eachValue >=120000 && eachValue <= 150000){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("-------------------------------------");

        //1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if(pairs.getValue() < 118000){
                System.out.println(pairs.getKey());
            }

        }

        System.out.println("--------------------------");

     //1.5 increase the salary of each employee by 10k if the current salary of employee is less than 120k

        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 120000) {
                entry.setValue(entry.getValue() + 10000);
            }
        }

        System.out.println(map);





    }
}
