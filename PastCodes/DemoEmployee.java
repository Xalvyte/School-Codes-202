package PastCodes;
import java.util.*;

public class DemoEmployee {
    static Scanner input = new Scanner(System.in);

    static void check(int emp, double sal, int terri) throws DataException{
        int code = 2;
        if (emp <= 1110){
            code = 2;
            throw new DataException(DataMessages.messages[code]);
        }
        else if (emp >= 8889){
            code = 3;
            throw new DataException(DataMessages.messages[code]);
        }
        else if (sal <= -1){
            code = 4;
            throw new DataException(DataMessages.messages[code]);
        }
        else if (sal >= 100001){
            code = 5;
            throw new DataException(DataMessages.messages[code]);
        }
    }

    public static void main(String[] args) {
        // Employee rhod = new Employee();
        // EmployeeWithTerritory railey = new EmployeeWithTerritory();
        int code = 0;
        int terri = 0;
        try {
            System.out.println("Enter Employee Details");
            System.out.print("Enter Employee Number\t:\t"); int emp = input.nextInt();
            System.out.print("Enter Employee Salary\t:\t"); double sal = input.nextDouble();

            Employee e1 = new Employee(emp, sal);

            check(emp, sal, terri);

            System.out.println("Enter Employee Details");
            System.out.print("Enter Employee Salary \t:\t"); emp = input.nextInt();
            System.out.print("Enter Employee Salary\t:\t"); sal = input.nextDouble();
            System.out.print("Enter Employee Territory\t:\t"); terri = input.nextInt();

            check(emp, sal, terri);

            EmployeeWithTerritory e2 = new EmployeeWithTerritory(emp, sal, terri);

            e1.display();


            e2.display();
        } catch (InputMismatchException e) {
            code = 1;
            System.out.println(DataMessages.messages[code]);
            
            
        }
        catch (DataException e){
            System.out.println("Error : " + e.getMessage());
        }
        finally{
            System.out.println("Thank you for using my program.");
        }
    }
}
