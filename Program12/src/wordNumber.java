import java.util.Scanner;
/**
 * Created by Paul on 12/2/2016.
 *  Continuing the discussion in Exercise 14.20, we reiterate the importance of designing check-writing systems to prevent alteration of check amounts.
 *  One common security method requires that the amount be written in numbers and spelled out in words as well.
 *  Even if someone is able to alter the numerical amount of the check, it’s extremely difficult to change the amount in words.
 *
 * Write an application that inputs a numeric check amount that’s less than $1000 and writes the word equivalent of the amount.
 *  For example, the amount 112.43 should be written as

 ONE hundred TWELVE and 43/100
 */

public class wordNumber
{
    public static void main(String args[])
    {
        double maxAmount = 1000.00;
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
                    if (check < maxAmount)
                    {
                        validEntry = true;
                        int writtenNum = (int) check;
                        double decimal = check -= writtenNum;
                        double frac = Math.round(decimal * 100);
                        int fraction = (int) frac;
                        Number_Word converter = new Number_Word();
                        System.out.println(converter.convert(writtenNum)+ " and " + fraction + "/100" );
                    }
                }
            }
        }
    }
}
