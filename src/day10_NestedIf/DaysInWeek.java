package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {
    int nu = 5;// 1 ~ 7

        if (nu == 1){
            System.out.println("Monday");
        }else if ( nu == 2){
            System.out.println(" Tuesday");
        }else if (nu == 3){
            System.out.println("wednesday");
        }else if ( nu == 4){
            System.out.println("Thursday");
        } else if (nu == 5){
            System.out.println("Friday");
        }else if (nu == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");

        }
        System.out.println("---------------------");
       String result4= (nu == 1)? "Monday" :(nu == 2)? "Tuesday" :(nu ==3)? "Wednesday" :(nu == 4)? "Thursday"
                :(nu==5)? "Friday" :(nu ==6)? "Saturday" :"Sunday";
        System.out.println(result4);


















    }











}
