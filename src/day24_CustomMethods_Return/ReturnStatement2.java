package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {
        nameOfMonth(30);

    }




    public static void nameOfMonth(int number) {//95



    if (number< 1 || number > 12){
        System.out.println("Invalid");
    return;//exits nameOfMonth method,remaining code of fragments of the month never gets executed
    }

       String  name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "April" : (number == 5) ? "May"
                : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                : (number == 11) ? "Nov" : "Dec";


        System.out.println("name = " + name);
    }










}
