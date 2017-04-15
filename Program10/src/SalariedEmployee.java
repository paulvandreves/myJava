import java.util.Calendar;

/**
 * Created by Paul on 11/2/2016.
 */

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName,
                            String social, date dob, double weeklySalary)
    {
        super(firstName, lastName, social, dob);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }

    @Override
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
    }

    @Override
      public String toString()
      {
             return String.format("salaried employee: %s%n%s: $%,.2f",
                        super.toString(), "weekly salary", getWeeklySalary());
      }






    } // end class SalariedEmployee

