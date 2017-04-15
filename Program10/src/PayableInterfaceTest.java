/**
 * Created by Paul on 11/2/2016.
 * Modify PayableInterfaceTest (Fig. 10.15) to polymorphically process two
 * Invoices, one SalariedEmployee, one HourlyEmployee, one CommissionEmployee and one Base PlusCommissionEmployee.
 * <p>
 * First output a String representation of each Payable object.
 * Next, if an object is a BasePlusCommissionEmployee, increase its base salary by 10%.
 * Finally, output the payment amount for each Payable object.
 */
public class PayableInterfaceTest
{
    public static void main(String[] args)
    {
        // create four-element Payable array
        Payable[] payableObjects = new Payable[7];

        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] =
                new SalariedEmployee("John", "Smith", "111-11-1111", new date(6, 12, 1943), 800.00);
        payableObjects[3] =
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", new date(2, 5, 2010), 1200.00);
        payableObjects[4] =
                new HourlyEmployee("Nick", "Claus", "222-22-2222", new date(10, 22, 1994), 42.01, 86.13);
        payableObjects[5] =
                new CommissionEmployee("Buddy", "The Elf", "123-45-6789", new date(4, 20, 1920), 98.45, .5);
        payableObjects[6] =
                new BasePlusCommissionEmployee("Rudolf", "The Red Nose", "999-99-9999", new date(3, 13, 2003), 20.02, 65.04, .2*.1); // *.1

        System.out.println(
                "Invoices and Employees processed polymorphically:");

        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects)
        {

            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(), // could invoke implicitly
                    "payment due", currentPayable.getPaymentAmount());
        }

        for (Payable p :payableObjects)

        {
            p.getPaymentAmount();
        }
    } // end main
}
