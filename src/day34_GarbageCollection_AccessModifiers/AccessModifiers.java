package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicDate = 100;

    static int defaultDate = 200;// access modifier: default

    private static int privateDate = 300;

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }





    public static void main(String[] args) {

        System.out.println(publicDate);
        System.out.println(defaultDate);
        System.out.println(privateDate);


    }








}
