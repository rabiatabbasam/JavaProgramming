package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammad","Ahmed", "Yuliya", "Christ"));

        //remove all the names "ahmed"

        //names.removeAll(Arrays.asList("Ahmed"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("--------------------------------------");

        List<String> names2= new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammad","Ahmed", "Yuliya", "Christ"));

      for (Iterator<String> i = names2.iterator(); i.hasNext();){
          if (i.next().equalsIgnoreCase("ahmed")){
              i.remove();
          }
      }

        System.out.println(names2);

        System.out.println("-----------------------------------------------");

        List<String> names3= new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammad","Ahmed", "Yuliya", "Christ"));

      names3.removeIf(each-> each.equalsIgnoreCase("ahmed"));

        System.out.println(names3);

        System.out.println("------------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,90,89,79,50));

       Iterator<Integer> q =  set.iterator();

       while (q.hasNext()){
           if(q.next() %2==0){
               q.remove();
           }
       }
        System.out.println(set);

        System.out.println("--------------------------------");

       set.removeIf(each-> each %2==0);









    }
}
