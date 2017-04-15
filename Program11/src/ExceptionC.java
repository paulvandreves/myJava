/**
 * Created by Paul on 11/15/2016.
 * where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB.
 * Write a program to demonstrate that the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.
 */
public class ExceptionC extends ExceptionB
{
    public ExceptionC(String message)
    {
        super(message);
    }
}
