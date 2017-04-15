/**
 * Created by Paul on 11/22/2016.
 * Write an application that inputs a dollar amount to be printed on a check,
 * then prints the amount in check-protected format with leading asterisks if necessary.
 * Assume that nine spaces are available for printing the amount.
 */ // use double up to 8 charters
import  java.util.Scanner;
public class CheckProtection
{
    private static double maxAmount = 1000;
    public static void main (String args [])
    {
        boolean validEntry = false;
        while (validEntry == false)
        {
            Scanner userEntry = new Scanner(System.in);
            System.out.println("Enter The check amount under a $1000.00 and greater that 0.");
            if (userEntry.hasNextDouble() == true)
            {
                double check = userEntry.nextDouble();
                if (check > 0)
                {
                    if(check < maxAmount)
                    {
                        validEntry = true;
                        String result = String.format("%9.2f", check); // 6 spaces width, 2 spaces precision, 'f' converts the double
                        System.out.println(result.replace(" ", "*"));
                    }
                }
            }
        }








    }













}
