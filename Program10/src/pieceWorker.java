
/**
 * Created by Paul on 11/5/2016.
 *  Modify the payroll system of Figs. 10.4–10.9 to include an additional
 *  Employee subclass PieceWorker that represents an
 *  employee whose pay is based on the number of pieces of merchandise produced.
 *
 *  Class PieceWorker should contain private instance variables wage
 *  (to store the employee’s wage per piece) and pieces (to store the number of pieces produced).
 *
 *  Provide a concrete implementation of method earnings in class PieceWorker that calculates the employee’s earnings
 *
 *  by multiplying the number of pieces produced by the wage per piece.
 *
 *  Create an array of Employee variables to store references to objects of each concrete class in the new Employee hierarchy.
 *
 *  For each Employee, display its String representation and earnings.
 */
import java.util.Calendar;

public class pieceWorker extends Employee   // no default constror avaible
{
    private double wage;  // must set variables through constructor or set method's
    private int pieces;


    public  pieceWorker(String firstName, String lastName, String social,date dob, double wage, int pieces )  // use some getters ?
    {
        super(firstName,lastName,social, dob );
        setWage(wage);
        setPieces(pieces);
        this.wage = wage;
        this.pieces = pieces;
        //getPaymentAmount();
    }

    public double getWage()
    {
        return wage;
    }
    public final void setWage(double wage)
    {
        wage = ( wage < 0.0 ) ? 0.0 : wage;

    }

    public int getPieces()
    {
        return pieces;
    }

    public final void setPieces(int pieces)
    {
        pieces = ( ( pieces >= 0 ) && ( pieces <= 10000 ) ) ?
                pieces : 0;
    }
    @Override
    public double earnings()
    {
        double earned = 0.0;
        earned = wage * pieces;
        return earned;

    }

    @Override
    public double getPaymentAmount()
    {
        double paymentAmount = 0;
        paymentAmount = earnings();
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (currentMonth ==  getBirthdate().getMonth() )
        {
            int count = 0;
            while (count <= 100)
            {
                paymentAmount ++;
            }
            System.out.println("just exited while loop");
        }
        System.out.println("in get payment amount ");
        return paymentAmount;
    }

    @Override
    public String toString()
    {
        return String.format("%s,%s,%s", // that works for int and float but we need to format the names of the classes
                "Piece Worker", super.toString(),
                "Pieces ", getPieces(),
                "Wage", getWage());
    }



}
