/**
 * Created by Paul on 11/2/2016.
 */
public class PayrollSystemTest
{
               public static void main(String[] args)
              {
                 // create subclass objects
                SalariedEmployee salariedEmployee =
                    new SalariedEmployee("John", "Smith", "111-11-1111", new date(11,22,1940), 800.00  );
                 HourlyEmployee hourlyEmployee =
                    new HourlyEmployee("Karen", "Price", "222-22-2222",new date(5,11,1984),800.00, 100 );
                 CommissionEmployee commissionEmployee =
                    new CommissionEmployee(
                  // firstname lastname ssn  date of birth, grossSales commission rate
                    "Sue", "Jones", "333-33-3333",new date(10,20,1989),10000,.06);
                 BasePlusCommissionEmployee basePlusCommissionEmployee =
                    new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "444-44-4444", new date(3,24,1972),5200,.05,400);
                  pieceWorker pieceWorker = new pieceWorker("John","Doe", "555-55-5555", new date(12,13,1920),8.0,45  );
                // create an object of pice worker to work with array
                 System.out.println("Employees processed individually:");

                 System.out.printf("%n%s%n%s: $%,.2f%n%n",
                    salariedEmployee, "earned", salariedEmployee.earnings());
                 System.out.printf("%s%n%s: $%,.2f%n%n",
                    hourlyEmployee, "earned", hourlyEmployee.earnings());
                 System.out.printf("%s%n%s: $%,.2f%n%n",
                    commissionEmployee, "earned", commissionEmployee.earnings());
                 System.out.printf("%s%n%s: $%,.2f%n%n",
                    basePlusCommissionEmployee,
                    "earned", basePlusCommissionEmployee.earnings());

                  System.out.printf("%s%n%s: $%s,%,.2f%n%n",
                          pieceWorker, "earned", pieceWorker.earnings(),pieceWorker.getPaymentAmount() );


                 // create four-element Employee array
                 Employee[] employees = new Employee[5];

                 // initialize array with Employees
                 employees[0] = salariedEmployee;
                 employees[1] = hourlyEmployee;
                 employees[2] = commissionEmployee;
                 employees[3] = basePlusCommissionEmployee;
                 employees[4] = pieceWorker;

                  System.out.println("###################################");
                 System.out.printf("Employees processed polymorphically:%n%n");

                 // generically process each element in array employees
                 for (Employee currentEmployee : employees)
                 {
                    System.out.println(currentEmployee); // invokes toString

                    // determine whether element is a BasePlusCommissionEmployee
                    if (currentEmployee instanceof BasePlusCommissionEmployee)// simmular to reflection
                    {
                       // downcast Employee reference to
                       // BasePlusCommissionEmployee reference
                       BasePlusCommissionEmployee employee =
                          (BasePlusCommissionEmployee) currentEmployee ;

                       employee.setBaseSalary(1.10 * employee.getBaseSalary());

                       System.out.printf(
                          "new base salary with 10%% increase is: $%,.2f%n",
                          employee.getBaseSalary());
                    } // end if

                    System.out.printf(
                       "earned $%,.2f%n%n", currentEmployee.earnings());
                 } // end for

                 // get type name of each object in employees array
                 for (int j = 0; j < employees.length; j++)
                    System.out.printf("Employee %d is a %s%n", j,
                       employees[j].getClass().getName());
                  System.out.println("*******" + employees[4].getPaymentAmount());

              } // end main
} // end class PayrollSystemTest


