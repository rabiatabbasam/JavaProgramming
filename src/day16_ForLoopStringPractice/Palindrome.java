package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        //"Java"==>"avaJ"==>false (not palindrome)
        //"Anna"==> "annA"===>true

    String word = "Civic";

    String reversed ="";

        for (int i =word.length()-1 ; i >=0 ; i--) {
            reversed +=word.charAt(i);

        }
       boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);






    }







}
