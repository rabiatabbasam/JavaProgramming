package day17_While_DoWhile;

public class FrequencyOfWords2 {

    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog CAT cAt caT";

        int frequency = 0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String eachSub = str.substring(i,i+3);//total number of characters

        if (eachSub.equalsIgnoreCase("Cat")){//total number of characters
        frequency++;
        }
        }
        System.out.println(frequency);
















    }















}
