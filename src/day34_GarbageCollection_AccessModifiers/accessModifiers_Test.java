package day34_GarbageCollection_AccessModifiers;

public class accessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.defaultDate);
        // private is not visible outside the class


        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3();// private is not visible outside the class


    }

}
