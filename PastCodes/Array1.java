package PastCodes;
import java.util.*;

public class Array1 {
    static Scanner input = new Scanner(System.in);
    static int [] array = new int [100];
    static int [] occurence = new int [999];


    public static void main (String [] args){

        System.out.println("Input positive integers (End with -999): ");

        int n = 0;

  
        for(int i = 0; i < array.length; i++){
            System.out.print(" ");
            n = input.nextInt();

            if (n == -999){
                break;
            }

            array[i] = n;

            for (int ii = 0; ii < array.length; i++){
                if (array[i] == array[ii]){
                    
                    occurence[i] = array[ii];
                }
            }
        }
        

    }
}
