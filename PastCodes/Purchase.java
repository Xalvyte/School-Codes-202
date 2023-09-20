package PastCodes;
public class Purchase {
    int invoice;
    double saleAmm, saleTax;

    public Purchase(int inv, double sale) {
    }

    public void setTax(double sale){
        saleTax = sale * .05;
    }

    public void setInvoice(int inv){
        invoice = inv;
    }

    public void setSale(double sale){
        saleAmm = sale;
    }


    public double getTax(double tax){
        
        return saleTax;
    }

    public double getSale(double sale){
        return saleAmm;
    }

    public int getInv(int inv){
        return invoice;
    }

    void display(){
        System.out.println("Invoice Number: " + invoice);
        System.out.println("Sale Ammount: " + saleAmm);
        System.out.println("Sales Tax: " + saleTax);
    }
    
}
