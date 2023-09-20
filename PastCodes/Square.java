package PastCodes;
import java.text.DecimalFormat;

class Square {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    protected double length, width, surfaceArea;

    public double getLength() {
        return length;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double computeSurfaceArea(double width, double length){
        surfaceArea = length * width;
        return surfaceArea;
    }

    public void display(){
        System.out.println("Displaying Square Details");
        System.out.println("Length\t\t:\t" + df.format(length));
        System.out.println("Width\t\t:\t" + df.format(width));
        System.out.println("Surface Area\t:\t" + df.format(computeSurfaceArea(width, length)));
    }


}
