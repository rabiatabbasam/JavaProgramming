package day32_Constructors;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersian;

//                  5.5,             7.5,           10$
     public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


public double calcCost() {
    double totalCost = (width * length) * unitPrice;

    if (isPersian) {
        totalCost += 200;
    }

return totalCost;
}


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
