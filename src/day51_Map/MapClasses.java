package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map< Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(30,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
       hashMap.put(5,"Ahmet");
       hashMap.put(null,"Cihad");

        System.out.println("hashMap = " + hashMap);

        //System.out.println(hashMap.get());

        Map< Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(30,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(null,"Huliya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map< Integer,String> treeMap = new TreeMap<>();//Kay can not be null, value can be null and duplicated
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(30,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Isabella");
        treeMap.put(5,"Ahmet");
       // treeMap.put(null,"Hulya");//does not accept null key

        System.out.println("treeMap = " + treeMap);

        Map< Integer,String> hashtable = new Hashtable<>();//key and value can not  null
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(30,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Isabella");
        hashtable.put(5,"Ahmet");

        System.out.println("hashtable = " + hashtable);

        //List<Integer> list = new ArrayList<>();

       // String str = null;
        //System.out.println(str.toUpperCase());


    }
}
