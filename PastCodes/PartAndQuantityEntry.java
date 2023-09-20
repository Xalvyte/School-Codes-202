package PastCodes;
import java.util.*;

public class PartAndQuantityEntry {
    static Scanner input = new Scanner(System.in);

    static void check(int partNo, int qua) throws DataException{
        int code = 2;
        if (partNo < 0){
            throw(new DataException(DataMessages.messages[code]));
        }
        code = 3;
        if (partNo > 999){
            throw(new DataException(DataMessages.messages[code]));
        }
        code = 4;
        if (qua < 1){
            throw(new DataException(DataMessages.messages[code]));
        }
        code = 5;
        if (qua > 5000){
            throw(new DataException(DataMessages.messages[code]));
        }

    }

    public static void main(String []args){
        int partNo, qua, code = 0;
        try{
            System.out.print("Enter Item number: "); partNo = input.nextInt();
            System.out.print("Enter quanity: "); qua = input.nextInt();
            
            check(partNo, qua);
            System.out.println(DataMessages.messages[code]);
        }
        catch (InputMismatchException s) {
            code = 1;
            System.out.println(DataMessages.messages[code]);
        }
        catch (DataException s){
            System.out.println("Error Message:" + s.getMessage());
        }
    }
}

