package day14_String;

public class StringMethod3 {

    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //            012345....
        String word1 = word.substring(0, 4+1);
       // String brand =
        System.out.println(word1);

        String str1 = word.substring(6);

        System.out.println(str1);
        System.out.println("-----------------");

        String word2 = "Java Programming Language";
   // string word2 = "Python C# Ruby";


        String s1 = word2.substring(0, word2 .indexOf(" "));//"Java"
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" "));//"Programming"
        String s3 = word2.substring(word2.lastIndexOf(" ")+1 );//"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----------------------------");

      String word3 = "Python C# Ruby";

      String s4 = word3.substring(0, word3.indexOf(" "));//Python
      String s5 = word3.substring(word3.indexOf(" ")+1 , word3.lastIndexOf(" "));
      String s6 = word3.substring(word3.lastIndexOf(" ")+1);

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);













    }





















}
