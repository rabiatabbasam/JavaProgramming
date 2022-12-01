package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(20);//1
        list.add(30);//3
        list.add(40);//4
        list.add(50);//6

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {// i: index number of list
        list.set(i, list.get(i)* 2);// elements
        }
        System.out.println(list);




//{1,2,3,4,5,6}
 // {2,4,6,8,10,12}





    }


}
