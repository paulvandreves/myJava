/**
 * In this chapter, you studied an inheritance hierarchy in which class BasePlusCommissionEmployee inherited from class CommissionEmployee.
 * However, not all types of employees are CommissionEmployees.
 * In this exercise, you’ll create a more
 * | general Employee superclass | that factors out the attributes and behaviors in class CommissionEmployeethat are common to all Employees.
 *
 * The common attributes and behaviors for all Employees are:
 * firstName, lastName, socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of method toString.
 *
 * Create a new superclass Employee that contains these instance variables and methods and a constructor.
 *
 *   Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee.
 *
 * Class CommissionEmployee should contain only the instance variables and methods that are not declared in superclass Employee.
 *
 * Class CommissionEmployee’s constructor should |invoke class Employee’s constructor| and CommissionEmployee’s toString method should invoke Employee’s toString method.
 *
 * Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommissionEmployeeTest apps using these new classes
 *
 * to ensure that the apps still display the same results for a CommissionEmployee object and BasePlusCommissionEmployeeobject, respectively.
 *
 * Created by Paul on 10/24/2016.
 */
public class Employee_Hierarchy {

    private String firstName;
    private String lastName;
    private String social;

    // the absence of this base constructor threw an error in the children classes
    public Employee_Hierarchy(){}

    public Employee_Hierarchy(String fn,String ln, String social)
    {
        firstName = fn;
        lastName = ln;
        this.social = social;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String toString()
    {
        return String.format(firstName,lastName,social);
    }



}
