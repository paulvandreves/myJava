/**
 * Created by Paul on 10/25/2016.
 *  (Creating a New Subclass of Employee) Other types of Employees might include SalariedEmployees
 *
 * who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
 * they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times
 * the hourly wage—for hours worked over 40 hours.

 Create class HourlyEmployee that inherits from class Employee (Exercise 9.14)
 and has instance variable hours
 (a double) that represents the hours worked, instance variable wage (a double) that represents the wages per hour,

 a constructor that takes as arguments a first name, a last name, a social security number,

 an hourly wage and the number of hours worked,

 set and get methods for manipulating the hours and wage,

 an earnings method to calculate an HourlyEmployee’s earnings based on the hours worked and a toString method

 that returns the HourlyEmployee’s String representation.

 Method setWage should ensure that wage is nonnegative,

 and setHours should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).

 Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.
 create employees in another program to run through this program
 */
import java.util.Scanner;
public class HourlyEmployee extends Employee_Hierarchy {

    private double hours = 0.0;
    private double wage = 0.0;


    Scanner input = new Scanner(System.in);
    public HourlyEmployee() // no argument nessary just call the method directly
    {
        System.out.println("enter the number of hours worked");
        hours = input.nextDouble();
        System.out.println("Enter the employees hourly wage");
        wage = input.nextDouble();
    }

    public double getHours()
    {
        return hours;
    }

    public double getWage()
    {
        return wage;
    }

    public void setHours(double hours)
    {
        if (hours > 168)
            throw new IllegalArgumentException("There are only 168 hours in a week, stop trying to gold brick and enter the actual amount that the employee worked");
        if (hours < 0.0)
            throw new IllegalArgumentException("You can't work negative hours, that's not event a thing");
        this.hours = hours;
    }

    public void setWage(double wage)
    {
        if (wage < 0.0 )
            throw new IllegalArgumentException("Wage cannot be negative");
        this.wage = wage;
    }

    public double earnings(double hours, double wage)
    {
        double result = hours * wage;
        return result;
    }


    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social securiy number", getSocial(),
                "Earnings", earnings(hours, wage),
                "Hours", getHours(),
                "wage", getWage()
        );

    }
}
