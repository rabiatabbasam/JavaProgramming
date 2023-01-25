package day53_FunctionalInterface;

import day52_Map_FunctionalInterface.MySecondFunctionalInterface;

import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> stringReverse =
                (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
          //  return reverse ;

                };

      //String result =   stringReverse.method("Wooden spoon");

        //System.out.println(result);



    }
}
