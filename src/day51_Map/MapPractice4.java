package day51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {

      //  String[] group1 = {"Duygu","Magda","Farangez","Edison","Farangis","Kerem"};
        //String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        //String[] group3 = {"Alex","Ali","Anndriy","Cassandra","Sevgul","Olha","Tito","Ozan"};
        //String[] group4 = {"Maria","Kristina","Amin","|George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin"};
        //String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badma","Zaeir","Anna","tamara","Eugene"};

        //pair: Id & names of students



        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu","Magda","Farangez","Edison","Farangis","Kerem"));
        ArrayList<String> group2 =  new ArrayList<>(Arrays.asList("Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex","Ali","Anndriy","Cassandra","Sevgul","Olha","Tito","Ozan"));
       ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria","Kristina","Amin","|George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin"));
       ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badma","Zaeir","Anna","tamara","Eugene"));

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9,group9);
        groups.put(24,group24);
        groups.put(5,group5);


      //  System.out.println(Arrays.toString(groups.get(1)));
        System.out.println(groups);

        /*
        for (String each : groups.get(24)) {
            System.out.println(each);
        }

     */


        System.out.println(groups.get(2).get(1));

        System.out.println("-----------------------------------------------------");

        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);

            }
        }







    }
}
