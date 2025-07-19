package BASICJAVA.BASIC;
//COREJAVA.ACCESS_SPICEFIER.STATIC//
public class Employee {
    int empId;
    String empName;
    //    Constant , It will belong to the Class itself
    static String empCompany="Tcs";



    public void empDetalis(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empCompany);
    }

    public static void main(String[] args) {
        Employee.empCompany="tcs 2015";

        Employee  e1= new Employee();
        e1.empDetalis();


    }
}
