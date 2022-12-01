package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 50;//a =30-7=23-7=16-7=9-7=2
        int b = 9;//only work on positive numbers

        int count  = 0;// count = 1+1=2+1 = 3+1= 4

        while(a >=b){
            a -= b;
        count++;
        }
        System.out.println(count+ "with a remainder of "+a);






















    }
















}
