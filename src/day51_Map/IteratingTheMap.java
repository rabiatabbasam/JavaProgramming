package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkin",70);
        students.put("Andriy",98);

        System.out.println(students);

        /*
      Set<String> keys =  students.keySet();
      for (String eachKey : keys) {
           // System.out.println(eachKey +" : "+students.get(eachKey));
        students.replace(eachKey, students.get(eachKey)+ 5);

        }

      */

       Map<String, Integer> earlyBird = new HashMap<>();// score >= 90
        Map<String, Integer> angryBird = new HashMap<>();//score <= 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
           if(value  >= 90){
               earlyBird.put(key, value);
           }else{
               angryBird.put(key,value);
           }
        }

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("angryBird = " + angryBird);

      Set<String> names =   students.keySet();

        System.out.println("---------------------------------------");

      // Collection<Integer> scores = students.values();
        List<Integer> scores  = new ArrayList<>(students.values());
       System.out.println(scores);

        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("-------------------------------");


        int maxScore=Integer.MIN_VALUE;
         int minScore=Integer.MAX_VALUE ;

        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
            if(score < minScore){
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("----------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);



















        // remove all the students whose score is less than 90
        for (String eachKey : students.keySet()) {

            Integer eachValue = students.get(eachKey);
            if(eachValue < 90){
                System.out.println(eachKey);
            }

        }

        System.out.println(students);








    }
}
