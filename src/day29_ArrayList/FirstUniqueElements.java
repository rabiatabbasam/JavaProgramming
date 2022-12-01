package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);//0
        list.add(1);//1
        list.add(2);//2
        list.add(3);//3
        list.add(3);//4
        list.add(4);//5
        list.add(5);//6
        list.add(5);//7


        System.out.println(list);

        for (Integer each : list) {

            int frequency = 0;

        for (Integer element : list) {

            if (element == each) {
                frequency++;
            }
        }

        if(frequency==1){
            System.out.println(each);
            break;
        }



        }









    }






















}
