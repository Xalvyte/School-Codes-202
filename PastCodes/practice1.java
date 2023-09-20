package PastCodes;
public class practice1{
    private int id;
    private String name;
    private String Add;
    private double price;

    practice1 (int a, String b, String c, double d){
        id = a; name = b; Add = c; price = d;
    }
    
    void display(){
        System.out.println("Number details: ");
        System.out.println("Id:\t " + id);
        System.out.println("Name:\t " + name);
        System.out.println("Add:\t " + Add);
        System.out.println("Price:\t " + price);
    }
}