/**
 * Created by Paul on 10/26/2016.
 */
public class Commission_EmployeeTest {

    public static void main (String[] ars)
    {
        CommissionEmployee employee = new CommissionEmployee(10000, 0.5);
        System.out.println("Employee info obtained by get methods");
        System.out.println("First name is");
        employee.setFirstName("John");
        System.out.println(employee.getFirstName());
        System.out.println("last name is");
        employee.setLastName("Doe");
        System.out.println(employee.getLastName());
        System.out.println("Social Security number is ");
        employee.setSocial("555 55 5555");
        System.out.println(employee.getSocial());
        System.out.println("Employee gross sales are");
        employee.setGrossSales(10000);
        System.out.println(employee.getGrossSales());
        System.out.println("Employees commission Rate is ");
        employee.setCommissionRate(0.5);
        System.out.println(employee.getCommissionRate());



        // find a way to set the values
    }
}
