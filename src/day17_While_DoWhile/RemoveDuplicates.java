package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";//ABC

        for (int i = 0; i < str.length() ; i++) {
            String  ch = ""+str.charAt(i);//"A","A","B","B","C","C"
            if (result.contains(ch)){// if the result already contains the character
                continue;//skips
            }

            result+= ch;

        }
        System.out.println(result);

        System.out.println("-------------------------------");

     String str1 = "JavaJavaPythonPython";

     String result1 = "";

        for (int i = 0; i < str1.length() ; i++) {
            String ch1 = ""+str1.charAt(i);
           // char ch1 = str1.charAt(i);

            if (result1.contains(""+ch1)){
                continue;
                //break; // exit
            }
        result1 +=ch1;

        }
        System.out.println(result1);

        System.out.println("---------------------------");
     /*  int num = 0;

        for (int i = 1; i <=3 ; i++) {
       if (valid){
           System.out.println("Logged in");
           break;
       }

        }
             if (i ==3){
                 System.out.println("Your account is locked");
             }
         */










    }















}
