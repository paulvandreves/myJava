/**
 * Created by Paul on 11/2/2016.
 */

 //Modify classes HourlyEmployee (Fig. 10.6) and CommissionEmployee (Fig. 10.7) to place them in the Payable hierarchy
import java.util.Calendar;

public class HourlyEmployee extends Employee implements Payable
{
    private double wage; // wage per hour
    private double hours; // hours worked for week

    //date date = new date(11,2,1989);


              // constructor
              public HourlyEmployee(String firstName, String lastName,
                 String social , date dob, double wage, double hours )
              {
                 super(firstName, lastName, social, dob );

                 if (wage < 0.0) // validate wage
                    throw new IllegalArgumentException(
                       "Hourly wage must be >= 0.0");

                 if ((hours < 0.0) || (hours > 168.0)) // validate hours
                    throw new IllegalArgumentException(
                       "Hours worked must be >= 0.0 and <= 168.0");
                 this.wage = wage;
                 this.hours = hours;
                  setWage(wage);
                  setHours(hours);
                 //this.getBirthdate().getMonth();

              }
              // set wage
              public void setWage(double wage)
              {
                 if (wage < 0.0) // validate wage
                    throw new IllegalArgumentException(
                       "Hourly wage must be >= 0.0");

                 this.wage = wage;
              }

              // return wage
              public double getWage()
              {
                 return wage;
              }

              // set hours worked
              public void setHours(double hours)
              {
                 if ((hours < 0.0) || (hours > 168.0)) // validate hours
                    throw new IllegalArgumentException(
                       "Hours worked must be >= 0.0 and <= 168.0");

                 this.hours = hours;
              }

              // return hours worked
              public double getHours()
              {
                 return hours;
              }

              // calculate earnings; override abstract method earnings in Employee
              @Override
                public double earnings()
              {
                 if (getHours() <= 40) // no overtime
                   return getWage() * getHours();
                 else
                    return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
              }

            @Override
            public double getPaymentAmount()
            {
                double paymentAmount = 0;
                paymentAmount = earnings();  // birth date should be declared and visible within the class
                // wil have to make a get birth date function to return the birth date member varible
                // call get birthdate within function
                date date = new date(10,20,2015);
                //Date datE = new Date();

                date.getMonth();
                int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
                if (currentMonth ==  date.getMonth() )
                {
                    int count = 0;
                    while (count <= 100)
                    {
                        paymentAmount ++;
                    }
                    System.out.println("just exited while loop");
                }
                return paymentAmount;
            }

    // return String representation of HourlyEmployee object
              @Override
      public String toString()
              {
                 return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                    super.toString(), "hourly wage", getWage(),
                    "hours worked", getHours());
              }
} // end class HourlyEmployee
