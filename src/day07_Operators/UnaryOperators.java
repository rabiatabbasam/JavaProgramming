package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

    int num1 = +25;
    int num2 = -25;

        System.out.println(num1 < num2);//false
        System.out.println(num2 < num1);//true

        System.out.println("-------------------------");

        int a = 5;
        ++a;//pre increment increase the value by 14 right away

        System.out.println(a);

        --a ;//pre decrement: decrease the value by 1 right away
        System.out.println(a);

        System.out.println("========================");


        int b = 100;

        System.out.println(++b);

        int c = 100;

        System.out.println(c++);//post increment: first passes the current value then increase the value by 1

        System.out.println(c);

        System.out.println("--------------------------------");

        int x = 200;

        System.out.println(--x);//pre decrement:

        int y = 200;

        System.out.println(y--);//post decrement
        System.out.println(y);

        System.out.println("----------------------------");


        int z = 45;
        System.out.println(++z);//46, z = 46
        System.out.println(z++);//46  z = 47
        System.out.println(z);//47


        int q = 30;
        System.out.println(--q);//pre decrement :29
        System.out.println(q--);//29
        System.out.println(q);//28













    }






}
