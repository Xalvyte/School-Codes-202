package PastCodes;
class EmployeeWithTerritory extends Employee{
    protected int empTerri;

    protected EmployeeWithTerritory(int num, double sal, int terri){
        super(num, sal);
        empTerri = terri;
    }

    public int getEmpTerri() {
        return empTerri;
    }

    public void display(){
        super.display();
        System.out.println("Employee Territory: " + empTerri);
    }
}
