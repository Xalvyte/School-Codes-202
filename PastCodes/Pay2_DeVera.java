package PastCodes;
import java.util.*;

public class Pay2_DeVera {
    public static void main(String [] args){
        Pay2_constructor_DeVera employee = new Pay2_constructor_DeVera();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employees Data: ");
        System.out.print("Hours Worked: ");
        double x = input.nextDouble();
        employee.setWork(x);
        System.out.print("Rate per hour: ");
        double y = input.nextDouble();
        employee.setRate(x);
        System.out.print("Withholding Rate (%) : ");
        double z = input.nextDouble();
        employee.setWithhold(x);

        System.out.println("Computation 1: The Net Pay of Employee: " + employee.computeNetPay(x, y, z));
        System.out.println("Computation 2: The Net Pay of Employee: " + employee.computeNetPay(x, y));
        System.out.println("Computation 3: The Net Pay of Employee: " + employee.computeNetPay(x));
    }
}
