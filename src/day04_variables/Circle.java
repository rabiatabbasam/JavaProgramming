package day04_variables;

public class Circle {

    public static void main(String[] args) {
        // PI, radius, diameter, area, perimeter

        double PI = 3.14;
        double radius = 5.5;
        double diameter =radius * 2;// radius multiplying by 2
        double area = radius * radius * PI;//finds the area of circle
        double perimeter = diameter * PI;//finds the perimeter of circle

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
