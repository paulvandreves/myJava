/**
 * Created by Paul on 12/5/2016.
 * Modify class Account in Fig. 15.9 to include
 * method combine, which takes a TransactionRecord object and combines the balance of the Account object
 * and the amount value of the TransactionRecord object.
 */
import java.io.Serializable;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

public class Account implements Serializable
{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

              // initializes an Account with default values
              public Account()
              {
                 this(0, "", "", 0.0); // call other constructor
              }

              // initializes an Account with provided values
              public Account(int account, String firstName,
                 String lastName, double balance)
              {
                 this.account = account;
                 this.firstName = firstName;
                 this.lastName = lastName;
                 this.balance = balance;
              }

              public void combine()
              {
                  System.out.println("Enter the account number of the person you are trying to reach");

                  TransactionRecord tr = new TransactionRecord(0,0);
                  Account acc = new Account();

                  //System.out.printf(acc + tr);
              }


              // set account number
              public void setAccount(int acct)
              {
                 this.account = account;
              }

              // get account number
              public int getAccount()
              {
                 return account;
              }

              // set first name
              public void setFirstName(String firstName)
              {
                 this.firstName = firstName;
              }

              // get first name
              public String getFirstName()
              {
                 return firstName;
              }

              // set last name
              public void setLastName(String lastName)
              {
                 this.lastName = lastName;
              }

              // get last name
              public String getLastName()
              {
                 return lastName;
              }

              // set balance
              public void setBalance(double balance)
              {
                 this.balance = balance;
              }

              // get balance
              public double getBalance()
              {
                 return balance;
              }
           }