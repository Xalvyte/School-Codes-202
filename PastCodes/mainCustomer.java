package PastCodes;
import java.util.*;

public class mainCustomer {
    static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        practice1 [] arrayCus = new practice1[2];
        for(int i = 0; i<arrayCus.length; i++){
            System.out.println("Customer Member " + (i+1) + " : ");
            arrayCus[i] = inputData();
        }

        System.out.println("2 Customer Details: ");
        for (int i = 0; i < arrayCus.length; i++){
            arrayCus[i].display();
        }
    }

    static practice1 inputData(){
        System.out.println("Enter Customer Details: ");
        System.out.print("Enter Membership Number: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = input.nextLine();
        System.out.print("Enter Customer Address: ");
        String add = input.nextLine();
        System.out.print("Enter Item Price: ");
        double price = input.nextDouble();


        practice1 cus = new practice1(id, name, add, price);
        return cus; 
    }
}
