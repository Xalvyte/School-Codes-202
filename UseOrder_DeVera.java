
import java.util.*;

public class UseOrder_DeVera {
    static Scanner input = new Scanner(System.in);

    static void check(int num, int quan, double price) throws DataException_DeVera{
        int code = 2;
        if (num <= 999){
            code = 2;
            throw new DataException_DeVera(DataMessages_DeVera.messages[code]);
        }
        else if (num >= 5001){
            code = 3;
            throw new DataException_DeVera(DataMessages_DeVera.messages[code]);
        }
        else if (quan <= -1){
            code = 4;
            throw new DataException_DeVera(DataMessages_DeVera.messages[code]);
        }
        else if (price <= -1){
            code = 5;
            throw new DataException_DeVera(DataMessages_DeVera.messages[code]);
        }
        else if (price >= 10001){
            code = 6;
            throw new DataException_DeVera(DataMessages_DeVera.messages[code]);
        }
    }
    
    public static void main(String[] args) {
        int code = 0;
        try {
            System.out.println("Order Details");
            System.out.print("Enter Customer number\t:\t"); int num = (input.nextInt()); input.nextLine();
            System.out.print("Enter Item description:\t:\t"); String desc = (input.nextLine());
            System.out.print("Enter Quantity\t\t:\t"); int quan = (input.nextInt());
            System.out.print("Enter Price\t\t: Php\t"); double price = (input.nextDouble());
    
            Order_DeVera o1 = new Order_DeVera(num, desc, quan, price, price);

            check(num, quan, price);
    
            System.out.println("Shipper Order Details");
            System.out.print("Enter Customer number\t:\t"); num = (input.nextInt()); input.nextLine();
            System.out.print("Enter Item description:\t:\t"); desc = (input.nextLine());
            System.out.print("Enter Quantity\t\t:\t"); quan = (input.nextInt());
            System.out.print("Enter Price\t\t: Php\t"); price = (input.nextDouble());
    
            ShippedOrder_DeVera o2 = new ShippedOrder_DeVera(num, desc, quan, price, price, quan);
    
            check(num, quan, price);

            System.out.println();
            o1.display();
            System.out.println();
            o2.display();
        } catch (InputMismatchException e) {
            code = 1;
            System.out.println(DataMessages_DeVera.messages[code]);
        } catch (DataException_DeVera e){
            System.out.println("Error : " + e.getMessage());
        }


    }
}
