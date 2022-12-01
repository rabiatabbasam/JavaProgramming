package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int s = 135;//
        String result = "";
        if (s >= 0 && s <= 100) {// if the s is valid (0 ~ 100)
            // 5 possibilities: A,B,C,D,F
            if (s >= 90) {// false: s < 90
                result = "Excellent";
            } else if (s >= 80) {// false: s < 80
                result = "Great";
            } else if (s >= 70) {// false: s < 70
                result = "Good";
            } else if (s >= 60) { //false: s < 60
                result = "Passed";
            } else {//
                result = "Failed";
            }

        } else {// if the s is not valid
            result = "Invalid s";
        }
        System.out.println("--------------------");
        // solution2: use ternaries Only
        String res = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed"
                : "Invalid s";
        System.out.println(res);

        System.out.println("-----------------------");
     // solution: 3
    String result2 = "";

    if (s >= 0 && s <= 100) {// if the s is valid (0 ~ 100)
        result2 = (s >= 90) ? "Excellent" :(s >= 80) ? "Great"
                :(s >= 70) ? "Good" :(s >= 60) ? "Passed" : "Failed";
    }else {
        result2 = "Invalid s";
        System.out.println(result2);
    }














    }
}