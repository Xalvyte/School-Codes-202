package PastCodes;
import java.util.*;

public class PurchaseArray {
    static Scanner input = new Scanner(System.in);

    public static void main (String [] args){
        Purchase [] array = new Purchase[2];
        for(int i = 0; i<array.length; i++){
            System.out.println("Enter Details for Purchase " + i + " : ");
            array[i] = inputting();
        }

        System.out.println("2 Customer Details: ");
        for (int i = 0; i < array.length; i++){
            array[i].display();
        }
            
    }

    static Purchase inputting(){
        System.out.println("Enter Customer Details: ");
        System.out.print("Invoice Number (1000 - 8000): ");
        int inv = input.nextInt();
        while((inv >= 8001) && (inv <= 999)){
            System.out.print("Invoice Number (1000 - 8000): ");
            inv = input.nextInt();
        }
        
        input.nextLine();
        System.out.print("Enter sale ammount: ");
        double sale = input.nextDouble();

        Purchase.setInvoice(inv);
        Purchase.setSale(sale);





        return pur; 
    }

}
