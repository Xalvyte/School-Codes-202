package PastCodes;
import java.util.*;


public class DemoSquare {
    static Scanner input = new Scanner(System.in);
    

    public static void main(String[] args) {
        Square s1 = new Square();
        Cube c1 = new Cube();

        System.out.println("Square Detail");
        System.out.print("Enter Length\t:\t"); s1.setLength(input.nextDouble());
        System.out.print("Enter Width\t:\t"); s1.setWidth(input.nextDouble());
    
        System.out.println("\nCube Detail");
        System.out.print("Enter Length\t:\t"); c1.setLength(input.nextDouble());
        System.out.print("Enter Width\t:\t"); c1.setWidth(input.nextDouble());
        System.out.print("Enter Breadth\t:\t"); c1.setBreadth(input.nextDouble());

        s1.display();
        c1.display();
    }   
}
