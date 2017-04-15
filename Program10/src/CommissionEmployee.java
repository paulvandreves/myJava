import java.util.Calendar;
import java.util.*;

/**
 * Created by Paul on 11/2/2016.
 */
public class CommissionEmployee extends Employee implements Payable
{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage


              // constructor
              public CommissionEmployee(String firstName, String lastName,
                 String socialSecurityNumber,date dob, double grossSales,
                 double commissionRate )
              {
                 super(firstName, lastName, socialSecurityNumber, dob );

                 if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
                    //throw new IllegalArgumentException(
                      // "Commission rate must be > 0.0 and < 1.0");

                 if (grossSales < 0.0) // validate
                    throw new IllegalArgumentException("Gross sales must be >= 0.0");

                 this.grossSales = grossSales;
                this.commissionRate = commissionRate;
              }

              // set gross sales amount
              public void setGrossSales(double grossSales)
              {
                 if (grossSales < 0.0) // validate
                    throw new IllegalArgumentException("Gross sales must be >= 0.0");

                 this.grossSales = grossSales;
              }

              // return gross sales amount
              public double getGrossSales()
              {
                 return grossSales;
              }

              // set commission rate
              public void setCommissionRate(double commissionRate)
              {
                 if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
                    throw new IllegalArgumentException(
                       "Commission rate must be > 0.0 and < 1.0");

                 this.commissionRate = commissionRate;
              }

              // return commission rate
              public double getCommissionRate()
              {
                 return commissionRate;
              }

              // calculate earnings; override abstract method earnings in Employee
              @Override
              public double earnings()
              {
                 return getCommissionRate() * getGrossSales();
              }

                @Override
                public double getPaymentAmount()// pass in specific date instance to parameters
                {
                    double paymentAmount = 0;
                    paymentAmount = earnings();
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

    // return String representation of CommissionEmployee object
              @Override
              public String toString()
              {
                 return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                    "commission employee", super.toString(),
                    "gross sales", getGrossSales(),
                    "commission rate", getCommissionRate());
              }
} // end class CommissionEmployee


