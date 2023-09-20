
import java.text.DecimalFormat;

class Order_DeVera{
    DecimalFormat df = new DecimalFormat("###,###,###,###.00");
    protected int cusNum, quan;
    protected String itemDesc;
    protected double unitPrice, totalPrice;

    protected Order_DeVera(int num, String desc, int qua, double price, double total){
        cusNum = num;
        itemDesc = desc;
        quan = qua;
        unitPrice = price;
        totalPrice = total;
    }

    public void setCusNum(int cusNum) {
        this.cusNum = cusNum;
    }
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    public void setQuan(int quan) {
        this.quan = quan;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getCusNum() {
        return cusNum;
    }
    public String getItemDesc() {
        return itemDesc;
    }
    public int getQuan() {
        return quan;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public double compute(){
        totalPrice = quan * unitPrice;
        return totalPrice;
    }

    public void display(){
        System.out.println("Display Order Details");
        System.out.println("Customer Number\t\t:\t" + (cusNum));
        System.out.println("Item Description\t:\t" + itemDesc);
        System.out.println("Quantity\t\t:\t" + quan);
        System.out.println("Price\t\t\t: Php\t" + unitPrice);
        System.out.println("Total Price\t\t: Php\t" + df.format(compute()));
    }
}