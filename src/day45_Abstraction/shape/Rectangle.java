package day45_Abstraction.shape;

public class Rectangle extends Shape{

   private double length,width;

    public Rectangle(double length,double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0) {
            System.out.println("Invalid length: " + length);

        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid width: " + width);

        }
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 *(length+width);
    }
}
