package day16_ForLoopStringPractice;

public class DigitLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School) (!@#$%WoodenSpoon";

        String digit =""; //12345
        String letters ="";//CydeoWoodenSpoon
        String specialChars ="";//!@#$%

        for (int i = 0; i < str.length() ; i++) {//i: index number of str (0 ~ last index)

            char ch = str.charAt(i);//ch: each character that we have in str

            if (ch >= '0' && ch <= '9'){//if the character is between '0' to '9' then it's digit
                digit += ch;
            } else if (ch>='A' && ch <= 'Z') {//if the character is between 'A' to 'Z' 0then it's letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {//if the character is between 'a' to 'z' 0then it's letter
                letters += ch;
            }else {//if the character is neither digit nor letter,then it' special character
         if (ch != ' '){// if the special character is not a space
             //
             specialChars += ch;
         }

            }

        }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);













    }
















}
