package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1 );// concatenation


        System.out.println(10+20);// 30 addition
        System.out.println(100-50);// 50 subtraction
        System.out.println(10*6); // 60 mulplication


        System.out.println(100/3);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = a/6d;// 16.0
        System.out.println(b);

        double c = (double) a/6.0d;  //16.6666
        System.out.println(c);

        System.out.println(1000);



    }
}


/*
+: Addition
-: Subtraction
*: Mulplication
/: Division
           in math:
           10/4 = 2.5
            100/4 = 33.33
           in java:
           10.0/4 = 2.5



%: Remainder
*/