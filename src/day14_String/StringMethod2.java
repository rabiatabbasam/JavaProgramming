package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
       String str2 = str.replace("Java" , "Python");//"Python is fun, i love learning Python"
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";//gmail
        email = email.replace("yahoo" ,"gmail");//JohnSmith@gmail.com

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python Python";
       String sentence2 = sentence.replace("Python","");//Java Java C# C# C++ C++
        System.out.println("sentence2 = " + sentence2);
       sentence2 = sentence2.replace("  "," ");

        System.out.println("sentence2 = " + sentence2);

     String s = "Dog Dog Dog Dog Dog Dog";
     s =s.replace("Dog","Cat");//"Cat....."
        System.out.println("s = " + s);

        String s1 = "C# is fun, C# is cool";
        s1 = s1.replace(" C# is c"," Java is c");
        System.out.println("s1 = " + s1);

        String s3 = "Java";
        s3 = s3.replace("a","e");//"Jeve"
        System.out.println(s3);

        System.out.println("------------------");

      String result = "Java Java Java";
      //result = result.replace("Java","Python");
        result = result.replaceFirst("Java","Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);


        String result3 = "Java";
        result3 = result3.replaceFirst("va","vo");//Jova
        System.out.println(result3);





    }



}
