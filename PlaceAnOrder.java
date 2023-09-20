
import java.util.*;

public class PlaceAnOrder {
    static Scanner input = new Scanner(System.in);

    static void checkError(int item, int quan) throws OrderException{
        int index = 2;
        if (item < 0){
            throw (new OrderException(OrderMessages.Error[index]));
        }
        else if (item > 9999){
            index = 3;
            throw (new OrderException(OrderMessages.Error[index]));
        }
        else if (quan <= 0){
            index = 4;
            throw (new OrderException(OrderMessages.Error[index]));
        }
        else if (quan >= 13){
            index = 5;
            throw (new OrderException(OrderMessages.Error[index]));
        }
        else if (item != 111 && item != 222 && item != 333 && item != 444){
            index = 6;
            throw (new OrderException(OrderMessages.Error[index]));
        }

    }
    public static void main(String[] args) {
        int itemNum, quaNum, index = 0;
        try {
            System.out.print("Enter Item number: "); itemNum = input.nextInt();
            System.out.print("Enter quantity: "); quaNum = input.nextInt();

            checkError(itemNum, quaNum);

            System.out.println(OrderMessages.Error[index]);

            if (itemNum == 111){
                double total = 50.77 * quaNum;
                System.out.println("Total Php " + total);
                System.out.println("\t\t("+ quaNum +"at Php 50.77 each)");
            }
            else if (itemNum == 222){
                double total = 83.85 * quaNum;
                System.out.println("Total Php " + total);
                System.out.println("\t\t("+ quaNum +"at Php 83.85 each)");
            }
            else if (itemNum == 333){
                double total = 138.61 * quaNum;
                System.out.println("Total Php " + total);
                System.out.println("\t\t("+ quaNum +"at Php 138.61 each)");
            }
            else if (itemNum == 444){
                double total = 341.67 * quaNum;
                System.out.println("Total Php " + total);
                System.out.println("\t\t("+ quaNum +"at Php 341.67 each)");
            }
            
        } catch (InputMismatchException s) {
           index = 1;
           System.out.println("Error Message: " + OrderMessages.Error[index]);
        } catch (OrderException s) {
            System.out.println("Error Message: " + s.getMessage());
        }

    } 
}
