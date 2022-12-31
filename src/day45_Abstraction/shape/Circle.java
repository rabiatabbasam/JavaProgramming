package day45_Abstraction.shape;

public class Circle extends Shape {

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }
    private double radius;

    public final static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Invalid radius: "+radius);
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + radius +
                '}';
    }
}
