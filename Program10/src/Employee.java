import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * Created by Paul on 11/2/2016.
 * 10.12 (Payroll System Modification) Modify the payroll system of Figs.
 * 10.4–10.9   |all children of Employee|  to include private instance variable birthdate in class Employee.
 * <p>
 * Use class date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class date.
 * <p>
 * Assume that payroll is processed once per month.
 * <p>
 * Create an array of Employee variables to store references to the various employee objects.
 * <p>
 * In a loop, calculate the payroll for each Employee (polymorphically),
 * and add a $100.00 bonus to the person’s payroll amount if the current month is the one in which the Employee’s birthday occurs.
 */

public abstract class Employee implements Payable
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private date birthdate;

    // constructor
    public Employee(String firstName, String lastName,
                    String social, date dob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = social;
        birthdate = dob;
    }


    // return first name
    public String getFirstName()
    {
        return firstName;
    }

    // return last name
    public String getLastName()
    {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public date getBirthdate()
    {
        return birthdate;
    }


    // return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                getBirthdate());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here


    public double getPaymentAmount()
    {
        double paymentAmount = 0;
        paymentAmount = earnings();
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (currentMonth == getBirthdate().getMonth())
        {
            int count = 0;
            while (count <= 100)
            {
                paymentAmount++;
            }
            System.out.println("just exited while loop");
        }
        System.out.println("in get payment amount ");
        return paymentAmount;


    } // end abstract class Employee
}


