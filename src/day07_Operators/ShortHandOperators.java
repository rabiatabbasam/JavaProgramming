package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

    //assignments: =

        int number = 100;
        System.out.println("number = " + number);//100

        number = 200;
        System.out.println("number = " + number);//200

        String word = "Java Programming";

        System.out.println("word = " + word);// java programming

        word = " Wooden Spoon";
        System.out.println("word = " + word);//wooden spoon

        word = "Cydeo";

        System.out.println("word = " + word);//cydeo


        //word = "123"+1;

        System.out.println("word = " + word);

        System.out.println("----------------------------");


        //Addition Assignment:

        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x+100);//300

        //x = x+200;
        x += 200;
        System.out.println("x = " + x);

        String str = " Wooden";

        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 += 5.5;          //8.9
        System.out.println("num1 = " + num1);
        
        double availAbleBalance = 1000.50;
        
        // deposit 300$
        
        availAbleBalance += 300;

        System.out.println("availAbleBalance = " + availAbleBalance);

        System.out.println("-------------------");

        // withdrawing 500$

        availAbleBalance -= 500;// available

        System.out.println("availAbleBalance = " + availAbleBalance);

        //withdraw 200$, then deposit 400$

        availAbleBalance -= 200;// available  balance = 600.5
        availAbleBalance += 400;// available balance = 1000.5

        System.out.println("availAbleBalance = " + availAbleBalance);

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2;// salary = salary * 2
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("----------------------");

        double num2 = 25000;
       // num2 = num2/2;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------");

        double num3 = 100;
        // % =

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------");

        int amount = 127;// cents

        int quarters = amount/ 25;
        int cents = amount %25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------");

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------------");

        int y = 300;

        y %= 16;
        System.out.println("y = " + y);

        int balance = 3500;

        // insurance fee:$153

        balance %= 153;

        System.out.println("balance = " + balance);




















    }








}
