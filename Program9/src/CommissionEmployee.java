/**
 * Created by Paul on 10/25/2016.
 *
 * Class CommissionEmployee should contain only the instance variables and methods that are not declared in superclass Employee.
 */

public class CommissionEmployee extends Employee_Hierarchy {
    /**
    *private final String firstName; these varibales should alredy exist as they were declared in the parent class
    *private final String lastName;
    *private final String social;
    */
    private double grossSales;
    private double commissionRate;

   // public CommissionEmployee(String firstName, String lastName, )
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getSocial() {
        return super.getSocial();
    }
    // not sure if these values are the same ones I made in the parent class
    public CommissionEmployee(double grossSales, double commissionRate ) {
        getFirstName();
        getLastName();
        getSocial();
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }
    /**
     * this.firstName = firstName;
     * this.firstName = lastName; wont compile due to private procetion in super class
     * this.social = social;
     *
     */
    public void setGrossSales(double grossSales)
    {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double earnings()
    {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social securiy number", getSocial(),
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }

}
