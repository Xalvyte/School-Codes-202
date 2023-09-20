package PastCodes;
import java.text.DecimalFormat;

class Employee {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    protected int empNum;
    protected double empSal;
    
    protected Employee(int num, double sal){
        empNum = num;
        empSal = sal;
    }

    public int getEmpNum() {
        return empNum;
    }
    
    public double getEmpSal() {
        return empSal;
    }

    public void display(){
        System.out.println("Employee Details");
        System.out.println("Employee Number : " + (empNum));
        System.out.println("Employee Salary : " + df.format(empSal));
    }

}
