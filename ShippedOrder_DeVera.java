
import java.text.DecimalFormat;

public class ShippedOrder_DeVera extends Order_DeVera {
    DecimalFormat df = new DecimalFormat("###,###,###,###.00");
    protected double shipping = 228;

    protected ShippedOrder_DeVera(int num, String desc, int qua, double price, double total, int shipping){
        super(num, desc, qua, price, total);
        this.shipping = shipping;
    }


    public double compute(){
        super.compute();
        totalPrice = totalPrice + shipping;
        return totalPrice; 
    }

    public void display(){
        System.out.println("Customer Number\t\t:\t" + (cusNum));
        System.out.println("Item Description\t:\t" + itemDesc);
        System.out.println("Quantity\t\t:\t" + quan);
        System.out.println("Price\t\t\t: Php\t" + unitPrice);
        System.out.println("Total Price\t\t: Php\t" + df.format(compute()));
        System.out.println("Handling Charge\t\t: Php\t" + shipping);
    }
}
