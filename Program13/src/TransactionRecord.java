/**
 * Created by Paul on 12/5/2016.
 * Objects of this class contain an account number and amount for the transaction.
 * Provide methods to modify and retrieve these values.
 *
 *
 */
public class TransactionRecord
{
    public TransactionRecord()
    {

    }

    private int AccountNumber;

    private int TransactionAmount;

    public int getAccountNumber()
    {
        return AccountNumber;
    }

    public int getTransactionAmount()
    {
        return TransactionAmount;
    }

    public  void setAccountNumber()
    {
        this.AccountNumber = AccountNumber;
    }

    public void setTransactionAmount()
    {
        this.TransactionAmount = TransactionAmount;
    }
}

