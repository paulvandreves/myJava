//  Modify class BasePlusCommissionEmployee (Fig. 10.8) such that it extends the version of class CommissionEmployee created in part (a).

import java.util.Calendar;

/**
 * Created by Paul on 11/2/2016.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String social, date dob,
                                      double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, social, dob,
                grossSales, commissionRate);

        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public double getPaymentAmount()
    {
        double paymentAmount = 0;
        paymentAmount = earnings();
        date date = new date(10, 20, 2015);
        //Date datE = new Date();
        date.getMonth();
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (currentMonth == date.getMonth())
        {
            int count = 0;
            while (count <= 100)
            {
                paymentAmount++;
            }
            System.out.println("just exited while loop");
        }
        return paymentAmount;
    }

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
} // end class BasePlusCommissionEmployee
