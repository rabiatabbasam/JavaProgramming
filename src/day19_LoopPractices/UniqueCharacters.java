package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";

        String result = "";//bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//'A' each character
            int count = 0;//represents the frequency of the char
            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked,with each character of string
                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                }

            }
        //     if (count == 1){//if the frequency of the character is 1, then the character is unique//   }

            if (count != 1){
                continue;
            }
            result+=ch;
        }
        System.out.println(result);

    }







}


























