package PastCodes;
import java.text.DecimalFormat;

class Cube extends Square {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    protected double breadth, lateralSurface;

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double computeLateralArea(double width, double length, double breadth){
        double lateralSurface = 2 * (width * (length+breadth));
        return lateralSurface;
    }

    public void display(){
        
        System.out.println("Displaying Cube Details");
        System.out.println("Length\t\t:\t" + df.format(length));
        System.out.println("Width\t\t:\t" + df.format(width));
        System.out.println("Breadth\t\t:\t" + df.format(breadth));
        System.out.println("Surface Area\t:\t" + df.format(computeLateralArea(width, length, breadth)));
    }
}
