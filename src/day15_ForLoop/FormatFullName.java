package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEO",
                lastName ="SCHOOL";

      // firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //C                            +    ydeo  ==> "Cydeo"
        firstName = (""+firstName.charAt(0) ).toUpperCase() +firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
    System.out.println(firstName);

    String fullName = firstName +" "+lastName;

        System.out.println("fullName = " + fullName);

     String firstname1 ="raBIA",
             lastName1 ="TABASSUM";

     firstname1= firstname1.substring(0,1).toUpperCase() + firstname1.substring(1).toLowerCase();

    lastName1 = lastName1.substring(0,1).toUpperCase() + lastName1.substring(1).toLowerCase();


String fullName1 = firstname1+" "+lastName1;

        System.out.println("fullName1 = " + fullName1);



    }













}
