/**
 * Created by Paul on 12/6/2016.
 * Write a program to create data for testing the program.
 *
 * Use the sample account data in Figs. 15.14 and 15.15.
 * Account Number Name Balance
 * 100     Alan Jones 348.17
 * 300      Mary Smith 27.19
 * 700 Suzy Green -14.22
 * 500 Sam Sharp 0.00
 *
 * Transaction file account# Transaction amount
 * 100   27.14
 * 300   62.11
 * 400 100.56
 * 900  82.17
 *
 * Run the program to create the files trans.txt and oldmast.txt to be used by your file-matching program.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
// replace Mike Fudge Agr 42 with above table
public class TestFile
{
    public static void main(String[] args)
    {
        File file = new File("test.txt");

        try
        {
            PrintWriter output = new PrintWriter(file);
            output.println("Alan Jones,Mary Smith,Suzy Green,Sam Sharp "); // name
            output.println("100,300,700,500"); // account #
            output.println("Ballance: 348.17, 27.19, -14.22, 0.00");                     // Ballance
            output.close();
        }// this will write to a file
        catch (IOException ex)
        {
            System.out.printf("ERROR: %s\n", ex);
        }

        try
        {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int AccountNum = input.nextInt();
            double Ballance = input.nextDouble();


            System.out.printf("Name:" + name,"Account Number:" + AccountNum, "Ballance:",Ballance );
        } catch (FileSystemNotFoundException ex) {
            System.out.printf("ERROR: %s\n", ex);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        Scanner inOldMaster = new Scanner(Paths.get("oldmast.txt"));
         Scanner inTransaction = new Scanner(Paths.get("trans.txt"));
         Formatter outNewMaster = new Formatter("newmast.txt");
        Account account = new Account();
        account.setAccount(inOldMaster.nextInt());
        account.setFirstName(inOldMaster.next());
        account.setLastName(inOldMaster.next());
        account.setBalance(inOldMaster.nextDouble());

        TransactionRecord transaction = new TransactionRecord();
        transaction.setAccountNumber(inTransaction.nextInt(0,));
        transaction.setAccountNumber(inTransaction.nextDouble(0,));

        outNewMaster.format("%d %s %s %.2f%n",
                account.getAccount(), account.getFirstName(),
                account.getLastName(), account.getBalance());


    }


}
