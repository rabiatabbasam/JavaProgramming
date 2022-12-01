package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

    String firstName ="Aaron";
    String lastName = "Daniel";
    int age= 19;
    String jobTitle = "SDET";
    String companyName = "Apple Inc";
    double salary = 10000.58;

    String fullName = firstName + " " + lastName;

        System.out.println(" full name of person is  " +  fullName);
        System.out.println(fullName + " is " + age + " years old");

        System.out.println(fullName + " is " + jobTitle + " , works at " + companyName
                + ", and " + fullName + "s' salary is $" + salary

        ) ;
    }
}
