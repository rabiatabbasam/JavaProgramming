package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B';//==
        String result = "";
        switch (ch){

            case 'A':
                result ="Excellent";
              break;
            case 'B':
                result ="Great job";
        break;
            case 'C':
                result = "Good";
        break;
            case 'D':
                result = "Passed";
        break;
            case 'F':
                result = "Failed";
        break;
            default:
                System.out.println("Invalid");

        }
        System.out.println(result);














    }















}
